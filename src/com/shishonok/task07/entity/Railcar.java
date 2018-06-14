package com.shishonok.task07.entity;

/**
 * Class represent railway vehicle that used for the carrying of cargo or
 * passengers.
 * 
 * @version 1 14.06.2018
 * @author Alexander Shishonok
 */
public abstract class Railcar extends RollingStock {

    private double maxLoadWeight;

    public Railcar() {
    }

    public Railcar(long id, String model, double length, double weight,
	    double maxLoadWeight) {
	super(id, model, length, weight);
	this.maxLoadWeight = maxLoadWeight;
    }

    public double getMaxLoadWeight() {
	return maxLoadWeight;
    }

    public void setMaxLoadWeight(double maxLoadWeight) {
	this.maxLoadWeight = maxLoadWeight;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(maxLoadWeight);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (!super.equals(obj))
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Railcar other = (Railcar) obj;
	if (Double.doubleToLongBits(maxLoadWeight) != Double
		.doubleToLongBits(other.maxLoadWeight))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Railcar [ " + super.toString() + " maxLoadWeight="
		+ maxLoadWeight + "]";
    }

}
