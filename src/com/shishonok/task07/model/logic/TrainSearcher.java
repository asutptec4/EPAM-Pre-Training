package com.shishonok.task07.model.logic;

import com.shishonok.task07.model.entity.Train;
import com.shishonok.task07.model.util.interfaces.IList;

public class TrainSearcher {
    public static Train searchLinear(IList<Train> list, int maxSpeed) {
	for(int i = 0; i < list.size(); i++) {
	    if (list.get(i).getLocomotive().getMaxSpeed() == maxSpeed) {
		return list.get(i);
	    }
	}
	return null;
    }
}
