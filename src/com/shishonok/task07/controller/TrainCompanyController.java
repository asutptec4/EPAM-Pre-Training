package com.shishonok.task07.controller;

import java.util.Random;

import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.entity.TrainCompany;
import com.shishonok.task07.model.exception.MissingRollingStockException;
import com.shishonok.task07.model.exception.NoTrainsException;
import com.shishonok.task07.model.logic.TrainCompanyManager;
import com.shishonok.task07.model.logic.TrainSorter;
import com.shishonok.task07.model.util.MyChangeableList;
import com.shishonok.task07.util.RandomTrainFactory;
import com.shishonok.task07.view.View;

public class TrainCompanyController {
    public static void start() {
	TrainCompany tc = new TrainCompany(1, "Bests train",
		new MyChangeableList<Train>());
	RandomTrainFactory factory = new RandomTrainFactory();
	int numberOfTrain = new Random().nextInt(10) + 1;
	for (int i = 0; i < numberOfTrain; i++) {
	    TrainCompanyManager.addTrain(tc, factory.createTrain());
	}

	View.println("Total count trains in " + tc.getName() + " is "
		+ TrainCompanyManager.countTrains(tc));
	try {
	    View.println("Largest train in " + tc.getName() + " is id="
		    + TrainCompanyManager.findLargestTrain(tc).getId());
	    View.println("Smallest train in " + tc.getName() + " is id="
		    + TrainCompanyManager.findSmallestTrain(tc).getId());
	} catch (NoTrainsException e) {
	    e.printStackTrace();
	}

	try {
	    TrainSorter.sortByLength(tc.getTrainPark());
	} catch (MissingRollingStockException e) {
	    e.printStackTrace();
	}
	View.println(tc.getTrainPark());
    }
}
