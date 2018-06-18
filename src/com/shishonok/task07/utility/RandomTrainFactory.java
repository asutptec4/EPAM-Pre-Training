package com.shishonok.task07.utility;

import java.util.Random;

import com.shishonok.task07.model.entity.CargoRailcar;
import com.shishonok.task07.model.entity.Locomotive;
import com.shishonok.task07.model.entity.PassangerRailcar;
import com.shishonok.task07.model.entity.Railcar;
import com.shishonok.task07.model.entity.TankRailcar;
import com.shishonok.task07.model.entity.Train;

public class RandomTrainFactory {
    // setting for random creation of train
    public static final int NUMBER_OF_VALUE = 10;
    public static final double MIN_LENGTH = 20;
    public static final double MAX_LENGTH = 40;
    public static final double MIN_WEIGHT = 10;
    public static final double MAX_WEIGHT = 20;
    public static final double MIN_POWER = 100;
    public static final double MAX_POWER = 1000;
    public static final int MIN_SPEED = 50;
    public static final int MAX_SPEED = 200;
    public static final int NUM_TYPE = 3;
    public static final int PASSANGER_TYPE = 0;
    public static final int CARGO_TYPE = 1;
    public static final int TANK_TYPE = 2;
    public static final int MIN_PASSANGER = 40;
    public static final int MAX_PASSANGER = 100;
    public static final double MIN_VOLUME = 1000;
    public static final double MAX_VOLUME = 3000;

    Random random;
    long serial = 1; // first serial number

    public RandomTrainFactory() {
	random = new Random();
    }

    public Train createTrain() {
	return createTrain(random.nextInt(NUM_TYPE));
    }

    public Train createTrain(int type) {
	Train train = new Train();
	train.setId(getId());
	train.setLocomotive(createLocomotive());
	int railcarNumber = random.nextInt(NUMBER_OF_VALUE) + NUMBER_OF_VALUE;
	MyUnchangeableList<Railcar> railcars = new MyUnchangeableList<Railcar>(
		railcarNumber);
	for (int i = 0; i < railcarNumber; i++) {
	    if (type == PASSANGER_TYPE) {
		railcars.add(createRailcar(PASSANGER_TYPE));
	    } else if (random.nextBoolean()) {
		railcars.add(createRailcar(CARGO_TYPE));
	    } else {
		railcars.add(createRailcar(TANK_TYPE));
	    }
	}
	train.setRailcarList(railcars);
	return train;
    }

    public Locomotive createLocomotive() {
	Locomotive locomotive = new Locomotive();
	locomotive.setId(getId());
	locomotive.setModel(randomModel());
	locomotive.setLength(randomDouble(MIN_LENGTH, MAX_LENGTH));
	locomotive.setWeight(
		MAX_WEIGHT / MIN_WEIGHT * randomDouble(MIN_WEIGHT, MAX_WEIGHT));
	locomotive.setEngineType(randomEngType());
	locomotive.setEnginePower(randomDouble(MIN_POWER, MAX_POWER));
	locomotive.setMaxSpeed(randomInt(MIN_SPEED, MAX_SPEED));
	locomotive.setMaxLoadCapasity(
		MIN_WEIGHT * randomDouble(MIN_WEIGHT, MAX_WEIGHT));
	return locomotive;
    }

    public Railcar createRailcar(int type) {
	Railcar railcar;
	long id = getId();
	String model = randomModel();
	double length = randomDouble(MIN_LENGTH, MAX_LENGTH);
	double weight = randomDouble(MIN_WEIGHT, MAX_WEIGHT);
	double maxLoadWeight = MIN_WEIGHT
		* randomDouble(MIN_WEIGHT, MAX_WEIGHT);
	switch (type) {
	case PASSANGER_TYPE:
	    railcar = new PassangerRailcar(id, model, length, weight,
		    maxLoadWeight, randomInt(MIN_PASSANGER, MAX_PASSANGER));
	    break;
	case CARGO_TYPE:
	    railcar = new CargoRailcar(id, model, length, weight,
		    maxLoadWeight);
	    break;
	case TANK_TYPE:
	    railcar = new TankRailcar(id, model, length, weight, maxLoadWeight,
		    randomDouble(MIN_VOLUME, MAX_VOLUME));
	    break;
	default:
	    railcar = new CargoRailcar(id, model, length, weight,
		    maxLoadWeight);
	    break;
	}
	return railcar;
    }

    private int randomInt(int min, int max) {
	return random.nextInt(max - min + 1) + min;
    }

    private double randomDouble(double min, double max) {
	return random.nextInt(NUMBER_OF_VALUE + 1) * (max - min) + min;
    }

    private String randomModel() {
	String[] models = { "XD-1", "AAA-5", "ST-1", "YR89" };
	return models[random.nextInt(models.length)];
    }

    private String randomEngType() {
	String[] models = { "diesel", "electric", "steam", "petroil" };
	return models[random.nextInt(models.length)];
    }

    private long getId() {
	return serial++;
    }
}
