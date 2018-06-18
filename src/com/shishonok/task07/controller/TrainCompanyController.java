package com.shishonok.task07.controller;

import java.util.Random;

import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.entity.TrainCompany;
import com.shishonok.task07.model.logic.TrainCompanyManager;
import com.shishonok.task07.utility.MyChangeableList;
import com.shishonok.task07.utility.MyUnchangeableList;
import com.shishonok.task07.utility.RandomTrainFactory;
import com.shishonok.task07.view.View;

public class TrainCompanyController {
    public static void start() {
	TrainCompany tc = new TrainCompany(1, "Bests train",
		new MyChangeableList<Train>());
	RandomTrainFactory factory = new RandomTrainFactory();
	int numberOfTrain = new Random().nextInt(20) + 1;
	for (int i = 0; i < numberOfTrain; i++) {
	    TrainCompanyManager.addTrain(tc, factory.createTrain());
	}
	TrainCompany tc2 = new TrainCompany(2, "Fast train",
		new MyUnchangeableList<>());
	for (int i = 0; i < numberOfTrain; i++) {
	    TrainCompanyManager.addTrain(tc, factory.createTrain());
	}
	View.println("Total count trains in " + tc.getName() + " is "
		+ TrainCompanyManager.countTrains(tc));
	View.println("Total count trains in " + tc2.getName() + " is "
		+ TrainCompanyManager.countTrains(tc));
	View.println("Largest train in " + tc.getName() + " is id="
		+ TrainCompanyManager.findLargestTrain(tc).getId());
	View.println("Smallest train in " + tc.getName() + " is id="
		+ TrainCompanyManager.findSmallestTrain(tc).getId());
    }
}
