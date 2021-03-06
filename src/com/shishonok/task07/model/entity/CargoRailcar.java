package com.shishonok.task07.model.entity;

/**
 * Railcar used for the carrying cargo.
 * 
 * @version 1 14.06.2018
 * @author Alexander Shishonok
 */
public class CargoRailcar extends Railcar {

    private String cargoName;
    private double currentWeight;

    public CargoRailcar() {
    }

    public CargoRailcar(long id, String model, double length, double weight,
	    double maxLoadWeight) {
	super(id, model, length, weight, maxLoadWeight);
    }

    public CargoRailcar(CargoRailcar crc) {
	super(crc.getId(), crc.getModel(), crc.getLength(), crc.getWeight(),
		crc.getMaxLoadWeight());
    }

    public String getCargoName() {
	return cargoName;
    }

    public void setCargoName(String cargoName) {
	this.cargoName = cargoName;
    }

    public double getCurrentWeight() {
	return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
	this.currentWeight = currentWeight;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result
		+ ((cargoName == null) ? 0 : cargoName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(currentWeight);
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
	CargoRailcar other = (CargoRailcar) obj;
	if (cargoName == null) {
	    if (other.cargoName != null)
		return false;
	} else if (!cargoName.equals(other.cargoName))
	    return false;
	if (Double.doubleToLongBits(currentWeight) != Double
		.doubleToLongBits(other.currentWeight))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("CargoRailcar [id=").append(getId()).append(", model=")
		.append(getModel()).append(", length=").append(getLength())
		.append(", weight=").append(getWeight())
		.append(", maxLoadWeight()=").append(getMaxLoadWeight())
		.append(", cargoName=").append(cargoName)
		.append(", currentWeight=").append(currentWeight).append("]");
	return builder.toString();
    }
}
