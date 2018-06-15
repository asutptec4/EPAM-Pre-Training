package com.shishonok.task07.entity;

import com.shishonok.task07.utility.TrainList;

/**
 * Simple model of a company that has several train.
 * 
 * @version 1 15.06.2018
 * @author Alexander Shishonok
 */
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

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	TrainCompany other = (TrainCompany) obj;
	if (id != other.id)
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "TrainCompany [id=" + id + ", "
		+ (name != null ? "name=" + name + ", " : "")
		+ (trainPark != null ? "trainPark=" + trainPark : "") + "]";
    }    
}
