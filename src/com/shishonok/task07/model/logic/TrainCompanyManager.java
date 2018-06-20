package com.shishonok.task07.model.logic;

import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.entity.TrainCompany;
import com.shishonok.task07.model.exception.MissingRollingStockException;
import com.shishonok.task07.model.exception.NoTrainsException;
import com.shishonok.task07.model.util.MyChangeableList;

public class TrainCompanyManager {

    public static boolean addTrain(TrainCompany tc, Train train) {
	if (train == null) {
	    return false;
	}
	if (tc.getTrainPark() == null) {
	    tc.setTrainPark(new MyChangeableList<Train>());
	}
	return tc.getTrainPark().add(train);
    }

    public static int countTrains(TrainCompany tc) {
	if (tc.getTrainPark() == null) {
	    return 0;
	}
	return tc.getTrainPark().size();
    }

    public static boolean removeTrainById(TrainCompany tc, long id)
	    throws NoTrainsException {
	if (tc.getTrainPark() == null || tc.getTrainPark().size() == 0) {
	    throw new NoTrainsException();
	}
	int endLoop = tc.getTrainPark().size();
	for (int i = 0; i < endLoop; i++) {
	    if (tc.getTrainPark().get(i).getId() == id) {
		tc.getTrainPark().remove(i);
		return true;
	    }
	}
	return false;
    }

    public static Train findLargestTrain(TrainCompany tc)
	    throws NoTrainsException {
	if (tc.getTrainPark() == null || tc.getTrainPark().size() == 0) {
	    throw new NoTrainsException();
	}
	Train temp = tc.getTrainPark().get(0);
	int endLoop = tc.getTrainPark().size();
	for (int i = 1; i < endLoop; i++) {
	    try {
		if (TrainManager.evalTrainLength(
			tc.getTrainPark().get(i)) > TrainManager
				.evalTrainLength(temp)) {
		    temp = tc.getTrainPark().get(i);
		}
	    } catch (MissingRollingStockException exc) {
		continue;
	    }
	}
	return temp;
    }

    public static Train findSmallestTrain(TrainCompany tc)
	    throws NoTrainsException {
	if (tc.getTrainPark() == null || tc.getTrainPark().size() == 0) {
	    throw new NoTrainsException();
	}
	Train temp = tc.getTrainPark().get(0);
	int endLoop = tc.getTrainPark().size();
	for (int i = 1; i < endLoop; i++) {
	    try {
		if (TrainManager.evalTrainLength(
			tc.getTrainPark().get(i)) < TrainManager
				.evalTrainLength(temp)) {
		    temp = tc.getTrainPark().get(i);
		}
	    } catch (MissingRollingStockException e) {
		continue;
	    }
	}
	return temp;
    }

}
