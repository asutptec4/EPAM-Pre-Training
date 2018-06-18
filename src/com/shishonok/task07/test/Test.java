package com.shishonok.task07.test;

import com.shishonok.task07.model.entity.Railcar;
import com.shishonok.task07.utility.MyChangeableList;
import com.shishonok.task07.utility.RandomTrainFactory;
import com.shishonok.task07.view.View;

public class Test {
    public static void execute() {
	View.println("Start test...");

	RandomTrainFactory factory = new RandomTrainFactory();
	MyChangeableList<Railcar> railcarList = new MyChangeableList<Railcar>();
	for (int i = 0; i < 10; i++) {
	    railcarList.add(factory.createRailcar(1));
	}
	for (int i = 0; i < 10; i++) {
	    View.println(railcarList.get(i));
	}
	Railcar rc = railcarList.get(3);
	View.println(rc);
	
//	String target = "XD-1";
//	Object[] railcars = railcarList
//		.findBy((el) -> target.equals(el.getModel()));
//	for (int i = 0; i < railcars.length; i++) {
//	    View.println(railcars[i]);
//	}

	View.println("End test.");
    }
}