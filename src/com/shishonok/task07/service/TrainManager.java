package com.shishonok.task07.service;

import com.shishonok.task07.entity.Locomotive;
import com.shishonok.task07.entity.Railcar;
import com.shishonok.task07.entity.Train;

/**
 * Provide some methods for working with Train.
 * 
 * @version 1 15.06.2018
 * @author Alexander Shishonok
 */
public class TrainManager {

    public static double evalTrainWeight(Train train) {
	double result = 0;
	for (int i = 0; i < train.getRailcarList().size(); i++) {
	    result += train.getRailcarList().get(i).getWeight();
	}
	return result + train.getLocomotive().getWeight();
    }

    public static double evalTrainLength(Train train) {
	double result = 0;
	for (int i = 0; i < train.getRailcarList().size(); i++) {
	    result += train.getRailcarList().get(i).getLength();
	}
	return result + train.getLocomotive().getLength();
    }

    public static double evalMaxTrainLoadCapacity(Train train) {
	double result = 0;
	for (int i = 0; i < train.getRailcarList().size(); i++) {
	    result += train.getRailcarList().get(i).getMaxLoadWeight();
	}
	return result;
    }

    public static boolean addRailcar(Train train, Railcar rc) {
	return train.getRailcarList().add(rc);
    }

    public static boolean removeLastRailcar(Train train) {
	return train.getRailcarList()
		.remove(train.getRailcarList().size() - 1) != null ? true : false;
    }

    public static boolean changeLocomotive(Train train, Locomotive locomotive) {
	if (locomotive == null) {
	    return false;
	}
	train.setLocomotive(locomotive);
	return true;
    }

}
