package com.shishonok.task07.model.entity;

import com.shishonok.task07.utility.interfaces.IList;

/**
 * To model the train with locomotive and a number of railcars.
 * 
 * @version 1 15.06.2018
 * @author Alexander Shishonok
 */
public class Train {

    private long id;
    private Locomotive locomotive;
    private IList<Railcar> railcarList;

    public Train() {
    }

    public Train(long id, Locomotive locomotive,
	    IList<Railcar> railcarList) {
	this.id = id;
	this.locomotive = locomotive;
	this.railcarList = railcarList;
    }

    public Train(Train train) {
	this.id = train.getId();
	this.locomotive = train.getLocomotive();
	this.railcarList = train.getRailcarList();
    }
    
    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public Locomotive getLocomotive() {
	return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
	this.locomotive = locomotive;
    }

    public IList<Railcar> getRailcarList() {
	return railcarList;
    }

    public void setRailcarList(IList<Railcar> railcarList) {
	this.railcarList = railcarList;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result
		+ ((locomotive == null) ? 0 : locomotive.hashCode());
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
	return true;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Train [id=").append(id).append(", locomotive=")
		.append(locomotive).append(", railcars=");
	for (int i = 0; i < railcarList.size(); i++) {
	    builder.append("\n [" + i + "] ");
	    builder.append(railcarList.get(i));
	}
	builder.append("]");
	return builder.toString();
    }

}
