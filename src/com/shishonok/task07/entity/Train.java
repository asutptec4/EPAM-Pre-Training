package com.shishonok.task07.entity;

import com.shishonok.task07.utility.RailcarList;

public class Train {

    private long id;
    private String name;
    private Locomotive locomotive;
    private RailcarList railcarList;

    public Train() {
    }

    public Train(long id, String name, Locomotive locomotive,
	    RailcarList railcarList) {
	this.id = id;
	this.name = name;
	this.locomotive = locomotive;
	this.railcarList = railcarList;
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

    public Locomotive getLocomotive() {
	return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
	this.locomotive = locomotive;
    }

    public RailcarList getRailcarList() {
	return railcarList;
    }

    public void setRailcarList(RailcarList railcarList) {
	this.railcarList = railcarList;
    }

    public boolean addRailcar(Railcar rc) {
	return false;
    }

    public boolean removeLastRailcar(Railcar rc) {
	return false;
    }

    public boolean changeLocomotive(Locomotive l) {
	return false;
    }
}
