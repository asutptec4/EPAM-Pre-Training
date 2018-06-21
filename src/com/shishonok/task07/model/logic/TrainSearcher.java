package com.shishonok.task07.model.logic;

import java.util.Comparator;

import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.util.interfaces.IList;

/**
 * Use for search train by train parameters.
 * 
 * @version 1 21.06.2018
 * @author Alexander Shishonok
 */
public class TrainSearcher {

    public static Train searchLinear(IList<Train> list, String engineType) {
	for (int i = 0; i < list.size(); i++) {
	    if (engineType
		    .equals(list.get(i).getLocomotive().getEngineType())) {
		return list.get(i);
	    }
	}
	return null;
    }

    public static Train searchBinary(IList<Train> list, int maxSpeed) {
	list.sortBubble(new Comparator<Train>() {
	    @Override
	    public int compare(Train o1, Train o2) {
		if (o1.getLocomotive().getMaxSpeed() > o2.getLocomotive()
			.getMaxSpeed()) {
		    return 1;
		} else if (o1.getLocomotive().getMaxSpeed() > o2.getLocomotive()
			.getMaxSpeed()) {
		    return 0;
		} else {
		    return -1;
		}
	    }
	});
	int min = 0;
	int max = list.size() - 1;
	while (min <= max) {
	    int mid = (min + max) / 2;
	    if (list.get(mid).getLocomotive().getMaxSpeed() == maxSpeed) {
		return list.get(mid);
	    } else if (maxSpeed < list.get(mid).getLocomotive().getMaxSpeed()) {
		max = mid - 1;
	    } else {
		min = mid + 1;
	    }
	}
	return null;
    }

}
