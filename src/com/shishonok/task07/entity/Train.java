package com.shishonok.task07.entity;

import com.shishonok.task07.utility.RailcarList;

/**
 * To model the train with locomotive and a number of railcars.
 * 
 * @version 1 15.06.2018
 * @author Alexander Shishonok
 */
public class Train {

    private long id;
    private String name;
    private Locomotive locomotive;
    private RailcarList railcars;

    public Train() {
    }

    public Train(long id, String name, Locomotive locomotive,
	    RailcarList railcarList) {
	this.id = id;
	this.name = name;
	this.locomotive = locomotive;
	this.railcars = railcarList;
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
	return railcars;
    }

    public void setRailcarList(RailcarList railcarList) {
	this.railcars = railcarList;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result
		+ ((locomotive == null) ? 0 : locomotive.hashCode());
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
	Train other = (Train) obj;
	if (id != other.id)
	    return false;
	if (locomotive == null) {
	    if (other.locomotive != null)
		return false;
	} else if (!locomotive.equals(other.locomotive))
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
	return "Train [id=" + id + ", "
		+ (name != null ? "name=" + name + ", " : "")
		+ (locomotive != null ? "locomotive=" + locomotive + ", " : "")
		+ (railcars != null ? "railcarList=" + railcars : "") + "]";
    }

}
