package com.shishonok.task07.model.entity;

/**
 * Class represent railway vehicle that provides the motive power for a train.
 * 
 * @version 1 14.06.2018
 * @author Alexander Shishonok
 */
public class Locomotive extends RollingStock {

    private String engineType;
    private double enginePower;
    private int maxSpeed;
    private double maxLoadCapasity;

    public Locomotive() {
    }

    public Locomotive(long id, String model, double length, double weight,
	    String engineType, double enginePower, int maxSpeed,
	    double maxLoadCapasity) {
	super(id, model, length, weight);
	this.engineType = engineType;
	this.enginePower = enginePower;
	this.maxSpeed = maxSpeed;
	this.maxLoadCapasity = maxLoadCapasity;
    }

    public String getEngineType() {
	return engineType;
    }

    public void setEngineType(String engineType) {
	this.engineType = engineType;
    }

    public double getEnginePower() {
	return enginePower;
    }

    public void setEnginePower(double enginePower) {
	this.enginePower = enginePower;
    }

    public int getMaxSpeed() {
	return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
    }

    public double getMaxLoadCapasity() {
	return maxLoadCapasity;
    }

    public void setMaxLoadCapasity(double maxLoadCapasity) {
	this.maxLoadCapasity = maxLoadCapasity;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(enginePower);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result
		+ ((engineType == null) ? 0 : engineType.hashCode());
	temp = Double.doubleToLongBits(maxLoadCapasity);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + maxSpeed;
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
	Locomotive other = (Locomotive) obj;
	if (Double.doubleToLongBits(enginePower) != Double
		.doubleToLongBits(other.enginePower))
	    return false;
	if (engineType == null) {
	    if (other.engineType != null)
		return false;
	} else if (!engineType.equals(other.engineType))
	    return false;
	if (Double.doubleToLongBits(maxLoadCapasity) != Double
		.doubleToLongBits(other.maxLoadCapasity))
	    return false;
	if (maxSpeed != other.maxSpeed)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Locomotive [id=").append(getId())
		.append(", model=").append(getModel())
		.append(", length=").append(getLength())
		.append(", weight=").append(getWeight())
		.append(", engineType=").append(engineType)
		.append(", enginePower=").append(enginePower)
		.append(", maxSpeed=").append(maxSpeed)
		.append(", maxLoadCapasity=").append(maxLoadCapasity)
		.append("]");
	return builder.toString();
    }

}
