package com.shishonok.task07.entity;

import com.shishonok.task07.utility.TrainList;

public class TrainCompany {
    
    private long id;
    private String name;
    private TrainList trainPark;

    public TrainCompany() {
    }

    public TrainCompany(long id, String name, TrainList trainPark) {
	this.id = id;
	this.name = name;
	this.trainPark = trainPark;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainList getTrainPark() {
        return trainPark;
    }

    public void setTrainPark(TrainList trainPark) {
        this.trainPark = trainPark;
    }

    public boolean addTrain(Train t) {
	return false;
    }
    
    public Train findLargestTrain() {
	return null;
    }
    
    public Train findSmallestTrain() {
	return null;
    }
}
