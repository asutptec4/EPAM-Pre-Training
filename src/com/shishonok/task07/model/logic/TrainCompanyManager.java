package com.shishonok.task07.model.logic;

import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.entity.TrainCompany;

public class TrainCompanyManager {

    public static boolean addTrain(TrainCompany tc, Train train) {
	if (train == null) {
	    return false;
	}
	return tc.getTrainPark().add(train);
    }

    public static int countTrains(TrainCompany tc) {
	return tc.getTrainPark().size();
    }

    public static boolean removeTrainById(TrainCompany tc, long id) {
	int endLoop = tc.getTrainPark().size();
	for (int i = 0; i < endLoop; i++) {
	    if (tc.getTrainPark().get(i).getId() == id) {
		tc.getTrainPark().remove(i);
		return true;
	    }
	}
	return false;
    }

    public static Train findLargestTrain(TrainCompany tc) {
	// TODO: add check by null list
	Train temp = tc.getTrainPark().get(0);
	int endLoop = tc.getTrainPark().size();
	for (int i = 1; i < endLoop; i++) {
	    if (TrainManager
		    .evalTrainLength(tc.getTrainPark().get(i)) > TrainManager
			    .evalTrainLength(temp)) {
		temp = tc.getTrainPark().get(i);
	    }
	}
	return temp;
    }

    public static Train findSmallestTrain(TrainCompany tc) {
	// TODO: add check by null list
	Train temp = tc.getTrainPark().get(0);
	int endLoop = tc.getTrainPark().size();
	for (int i = 1; i < endLoop; i++) {
	    if (TrainManager
		    .evalTrainLength(tc.getTrainPark().get(i)) < TrainManager
			    .evalTrainLength(temp)) {
		temp = tc.getTrainPark().get(i);
	    }
	}
	return temp;
    }

}
