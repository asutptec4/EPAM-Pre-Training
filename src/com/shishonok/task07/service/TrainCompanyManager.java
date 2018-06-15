package com.shishonok.task07.service;

import com.shishonok.task07.entity.Train;
import com.shishonok.task07.entity.TrainCompany;

public class TrainCompanyManager {
    
    private TrainCompany tc;
    
    public TrainCompanyManager(TrainCompany tc) {
	this.tc = tc;
    }

    public boolean addTrain(Train train) {
	if (train == null) {
	    return false;
	}
	return tc.getTrainPark().add(train);
    }
    
    public boolean removeTrainById(long id) {
	for (int i = 0; i < tc.getTrainPark().size(); i++) {
	    if (tc.getTrainPark().get(i).getId() == id) {
		tc.getTrainPark().remove(i);
		return true;
	    }
	}
	return false;
    }
    
    public Train findLargestTrain() {
	Train temp = tc.getTrainPark().get(0);
	for (int i = 1; i < tc.getTrainPark().size(); i++) {
	    if (TrainManager.evalTrainLength(tc.getTrainPark().get(i)) > TrainManager.evalTrainLength(temp)) {
		temp = tc.getTrainPark().get(i);
	    }
	}
	return temp;
    }
    
    public Train findSmallestTrain() {
	Train temp = tc.getTrainPark().get(0);
	for (int i = 1; i < tc.getTrainPark().size(); i++) {
	    if (TrainManager.evalTrainLength(tc.getTrainPark().get(i)) < TrainManager.evalTrainLength(temp)) {
		temp = tc.getTrainPark().get(i);
	    }
	}
	return temp;
    }

}
