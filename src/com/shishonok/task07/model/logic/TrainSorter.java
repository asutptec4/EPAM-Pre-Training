package com.shishonok.task07.model.logic;

import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.exception.MissingRollingStockException;
import com.shishonok.task07.model.util.interfaces.IList;

/**
 * Use for sort train by total length. 
 * For sorting train by instance of train parameters use sort
 * method provides by my collection.
 * 
 * @version 1 21.06.2018
 * @author Alexander Shishonok
 */
public class TrainSorter {

    public static void sortByLength(IList<Train> list)
	    throws MissingRollingStockException {
	if (list.size() < 2) {
	    return;
	}
	for (int i = list.size() - 1; i > 0; i--) {
	    boolean flag = true;
	    for (int j = 0; j < i; j++) {
		if (TrainManager.evalTrainLength(list.get(j)) > TrainManager
			.evalTrainLength(list.get(j + 1))) {
		    flag = false;
		    list.swap(i, j);
		}
	    }
	    if (flag) {
		break;
	    }
	}
    }

}
