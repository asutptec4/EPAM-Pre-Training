package com.shishonok.task07.entity;

/**
 * Railcar used for the carrying passengers.
 * 
 * @version 1 14.06.2018
 * @author Alexander Shishonok
 */
public class PassangerRailcar extends Railcar {

    private int maxPassanger;
    private int numberPassangers;

    public PassangerRailcar() {
    }

    public PassangerRailcar(long id, String model, double length, double weight,
	    double maxLoadWeight, int maxPassanger) {
	super(id, model, length, weight, maxLoadWeight);
	this.maxPassanger = maxPassanger;
    }

    public int getMaxPassanger() {
	return maxPassanger;
    }

    public void setMaxPassanger(int maxPassanger) {
	this.maxPassanger = maxPassanger;
    }

    public int getNumberPassangers() {
	return numberPassangers;
    }

    public void setNumberPassangers(int numberPassangers) {
	this.numberPassangers = numberPassangers;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + maxPassanger;
	result = prime * result + numberPassangers;
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
	PassangerRailcar other = (PassangerRailcar) obj;
	if (maxPassanger != other.maxPassanger)
	    return false;
	if (numberPassangers != other.numberPassangers)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "PassangerRailcar [ " + super.toString() + " maxPassanger="
		+ maxPassanger + ", numberPassangers=" + numberPassangers + "]";
    }

}
