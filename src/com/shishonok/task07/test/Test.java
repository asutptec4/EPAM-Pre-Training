package com.shishonok.task07.test;

import java.util.Comparator;

import com.shishonok.task07.model.entity.Railcar;
import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.exception.MissingRollingStockException;
import com.shishonok.task07.model.logic.TrainManager;
import com.shishonok.task07.model.util.MyChangeableList;
import com.shishonok.task07.model.util.MyUnchangeableList;
import com.shishonok.task07.model.util.interfaces.IList;
import com.shishonok.task07.util.RandomTrainFactory;
import com.shishonok.task07.view.View;

/**
 * Tests for task07.
 * 
 * @version 1 17.06.2018
 * @author Alexander Shishonok
 * 
 */
public class Test {
    public static void execute() {
	View.println("Start test...");
	// Try add more then size of the unchangeable list
	RandomTrainFactory factory = new RandomTrainFactory();
	IList<Railcar> railcarList = new MyUnchangeableList<Railcar>(6);
	for (int i = 0; i < 8; i++) {
	    View.print(railcarList.add(factory.createRailcar(1)) + " ");
	}
	View.println("Total count=" + railcarList.size());
	// Show all element, test get method
	Railcar[] railcars = new Railcar[railcarList.size()];
	for (int i = 0; i < railcarList.size(); i++) {
	    View.println(railcars[i] = railcarList.get(i));
	}
	Railcar rc = railcarList.get(3);
	View.println(rc);
	// Try remove element
	railcarList.remove(3);
	View.println("Total count=" + railcarList.size());
	// Try add array of elements in changeable list
	IList<Railcar> railcarList2 = new MyChangeableList<Railcar>(3);
	View.println("Create new changeable list, size before "
		+ railcarList2.size());
	View.println("Try add " + railcars.length + " elem list "
		+ railcarList2.add(railcars));
	View.println("Size after " + railcarList2.size());
	// Try add array of elements in unchangeable list
	IList<Railcar> railcarList3 = new MyUnchangeableList<Railcar>(3);
	View.println("Create new changeable list, size before "
		+ railcarList3.size());
	View.println("Try add " + railcars.length + " elem list "
		+ railcarList3.add(railcars));
	View.println("Size after " + railcarList3.size());
	// Test contain method
	View.println(railcarList.contains(rc));
	View.println(railcarList2.contains(rc));
	// Try clear list
	View.println("Size before " + railcarList2.size() + "\n clearing...");
	railcarList2.clear();
	View.println("Size after " + railcarList2.size());
	// Test TrainManager class
	View.println("Crate train:");
	Train train = new Train(1, factory.createLocomotive(), railcarList);
	View.println(train);
	try {
	    View.println("Sum length " + TrainManager.evalTrainLength(train));
	    View.println("Sum weight " + TrainManager.evalTrainWeight(train));
	    View.println("Sum capacity "
		    + TrainManager.evalMaxTrainLoadCapacity(train));
	} catch (MissingRollingStockException e) {
	    View.println(e);
	}
	// Remove last railcar
	try {
	    TrainManager.removeLastRailcar(train);
	} catch (MissingRollingStockException e) {
	    View.println(e);
	}
	View.println(train);
	// Test exception
	train.setLocomotive(null);
	try {
	    TrainManager.addRailcar(train, rc);
	} catch (MissingRollingStockException e) {
	    View.println(e);
	}
	// Test sort
	View.println("Collection before");
	View.println(railcarList);
	Comparator<Railcar> comparator = new Comparator<Railcar>() {
	    @Override
	    public int compare(Railcar o1, Railcar o2) {
		if (o1.getLength() > o2.getLength()) {
		    return 1;
		} else if (o1.getLength() > o2.getLength()) {
		    return 0;
		} else {
		    return -1;
		}
	    }
	};
	// railcarList.sortBubble(comparator);
	// railcarList.sortInsert(comparator);
	railcarList.sortSelection(comparator);
	View.println("Collection after");
	View.println(railcarList);
	View.println("End test.");
    }
}