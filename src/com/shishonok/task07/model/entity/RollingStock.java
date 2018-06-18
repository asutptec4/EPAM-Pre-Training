package com.shishonok.task07.model.entity;

/**
 * Class represent basic attributes of railway vehicle
 * 
 * @version 1 14.06.2018
 * @author Alexander Shishonok
 */
public class RollingStock {

    private long id;
    private String model;
    private double length;
    private double weight;

    public RollingStock() {
    }

    public RollingStock(long id, String model, double length, double weight) {
	super();
	this.id = id;
	this.model = model;
	this.length = length;
	this.weight = weight;
    }

    public RollingStock(RollingStock rs) {
	this.id = rs.getId();
	this.model = rs.getModel();
	this.length = rs.getLength();
	this.weight = rs.getWeight();
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public double getLength() {
	return length;
    }

    public void setLength(double length) {
	this.length = length;
    }

    public double getWeight() {
	return weight;
    }

    public void setWeight(double weight) {
	this.weight = weight;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (id ^ (id >>> 32));
	long temp;
	temp = Double.doubleToLongBits(length);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	temp = Double.doubleToLongBits(weight);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	RollingStock other = (RollingStock) obj;
	if (id != other.id)
	    return false;
	if (Double.doubleToLongBits(length) != Double
		.doubleToLongBits(other.length))
	    return false;
	if (model == null) {
	    if (other.model != null)
		return false;
	} else if (!model.equals(other.model))
	    return false;
	if (Double.doubleToLongBits(weight) != Double
		.doubleToLongBits(other.weight))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("RollingStock [id=").append(id).append(", model=")
		.append(model).append(", length=").append(length)
		.append(", weight=").append(weight).append("]");
	return builder.toString();
    }

}
