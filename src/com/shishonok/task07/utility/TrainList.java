package com.shishonok.task07.utility;

import com.shishonok.task07.entity.Train;
import com.shishonok.task07.utility.interfaces.IList;

/**
 * Container for Train class element.
 * 
 * @version 1 15.06.2018
 * @author Alexander Shishonok
 */
public class TrainList implements IList<Train> {

    public static final int DEFAULT_INIT_SIZE = 4;
    public static final int DEFAULT_SIZE_MULTIPLIER = 2;
    private Train[] array;
    private int currentIndex;
    private int maxElementIndex;

    public TrainList() {
	this(DEFAULT_INIT_SIZE);
    }

    public TrainList(int maxElementIndex) {
	this.maxElementIndex = maxElementIndex;
	array = new Train[maxElementIndex];
	currentIndex = 0;
    }

    @Override
    public boolean add(Train el) {
	if (currentIndex >= maxElementIndex) {
	    resize();
	}
	array[currentIndex++] = el;
	return true;
    }

    @Override
    public boolean add(Train[] el) {
	if (maxElementIndex - currentIndex <= el.length) {
	    resize();
	}
	for (int i = 0; i < el.length; i++) {
	    array[currentIndex++] = el[i];
	}
	return true;
    }

    @Override
    public int size() {
	return currentIndex;
    }

    @Override
    public boolean isEmpty() {
	if (currentIndex == 0) {
	    return true;
	} else {
	    return false;
	}
    }

    @Override
    public Train get(int index) {
	if (index < 0 || index >= currentIndex) {
	    throw new IndexOutOfBoundsException();
	}
	return array[index];
    }

    @Override
    public Train remove(int index) {
	if (index < 0 || index >= currentIndex) {
	    throw new IndexOutOfBoundsException();
	}
	Train temp = null;
	int endLoop = currentIndex - 1;
	for (int i = index; i < endLoop; i++) {
	    temp = array[i];
	    array[i] = array[i + 1];
	    array[i + 1] = temp;
	}
	temp = array[--currentIndex];
	array[currentIndex] = null;
	return temp;
    }

    @Override
    public void clear() {
	maxElementIndex = DEFAULT_INIT_SIZE;
	array = new Train[maxElementIndex];;
	currentIndex = 0;
    }

    @Override
    public int contains(Train el) {
	for (int i = 0; i < currentIndex; i++) {
	    if (el.equals(array[i])) {
		return i;
	    }
	}
	return -1;
    }

    private void resize() {
	maxElementIndex = array.length * DEFAULT_SIZE_MULTIPLIER;
	Train[] tempArray = new Train[maxElementIndex];
	for (int i = 0; i < array.length; i++) {
	    tempArray[i] = array[i];
	}
	array = tempArray;
    }
}
