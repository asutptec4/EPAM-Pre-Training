package com.shishonok.task07.model.logic;

import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.exception.MissingRollingStockException;
import com.shishonok.task07.model.util.interfaces.IList;

/**
 * Use for sort train by total length. For sorting train by instance of train
 * parameters use sort method provides by my collection.
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

    public static void sortByWeight(IList<Train> list)
	    throws MissingRollingStockException {
	if (list.size() < 2) {
	    return;
	}
	int h = 1;
	while (h <= list.size() / 3) {
	    h = h * 3 + 1;
	}
	while (h > 0) {
	    for (int i = h; i < list.size(); i++) {
		int j = i;
		while (j > h - 1) {
		    if (TrainManager
			    .evalTrainWeight(list.get(j - h)) < TrainManager
				    .evalTrainWeight(list.get(j))) {
			break;
		    }
		    list.swap(j, j - h);
		    j -= h;
		}
	    }
	    h = (h - 1) / 3;
	}
    }

    public static void sortByLoadCapacity(IList<Train> list)
	    throws MissingRollingStockException {
	sortQuick(list, 0, list.size() - 1);
    }

    private static void sortQuick(IList<Train> list, int start, int end)
	    throws MissingRollingStockException {
	if (start >= end) {
	    ;
	} else {
	    int i = start, j = end, cur = i - (i - j) / 2;
	    while (i < j) {
		while (i < cur && TrainManager
			.evalMaxTrainLoadCapacity(list.get(i)) <= TrainManager
				.evalMaxTrainLoadCapacity(list.get(cur))) {
		    i++;
		}
		while (j > cur && TrainManager
			.evalMaxTrainLoadCapacity(list.get(cur)) <= TrainManager
				.evalMaxTrainLoadCapacity(list.get(j))) {
		    j--;
		}
		if (i < j) {
		    list.swap(i, j);
		    if (i == cur) {
			cur = j;
		    } else {
			cur = i;
		    }
		}
	    }
	    sortQuick(list, start, cur);
	    sortQuick(list, cur + 1, end);
	}
    }
}
