package com.shishonok.task07.utility;

import com.shishonok.task07.entity.Railcar;
import com.shishonok.task07.utility.interfaces.IList;

/**
 * Container for Railcar class element.
 * 
 * @version 1 15.06.2018
 * @author Alexander Shishonok
 */
public class RailcarList implements IList<Railcar> {

    public static final int DEFAULT_MAX_SIZE = 8;
    private Railcar[] array;
    private int currentIndex;
    private int maxElementIndex;

    public RailcarList() {
	this(DEFAULT_MAX_SIZE);
    }

    public RailcarList(int maxElementIndex) {
	this.maxElementIndex = maxElementIndex;
	array = new Railcar[maxElementIndex];
	currentIndex = 0;
    }

    @Override
    public boolean add(Railcar el) {
	if (currentIndex < maxElementIndex) {
	    array[currentIndex++] = el;
	    return true;
	}
	return false;
    }

    @Override
    public boolean add(Railcar[] el) {
	if (maxElementIndex - currentIndex <= el.length) {
	    for (int i = 0; i < el.length; i++) {
		array[currentIndex++] = el[i];
	    }
	    return true;
	}
	return false;
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
    public Railcar get(int index) {
	if (index < 0 || index >= currentIndex) {
	    throw new IndexOutOfBoundsException();
	}
	return array[index];
    }

    @Override
    public Railcar remove(int index) {
	if (index < 0 || index >= currentIndex) {
	    throw new IndexOutOfBoundsException();
	}
	Railcar temp = null;
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
	array = new Railcar[maxElementIndex];
	currentIndex = 0;
    }

    @Override
    public int contains(Railcar el) {
	for (int i = 0; i < currentIndex; i++) {
	    if (el.equals(array[i])) {
		return i;
	    }
	}
	return -1;
    }

    public Railcar[] findByMaxLoad(double maxLoad) {
	int count = 0;
	for (Railcar el : array) {
	    if (el.getMaxLoadWeight() == maxLoad) {
		count++;
	    }
	}
	if (count != 0) {
	    Railcar[] railcars = new Railcar[count];
	    int i = 0;
	    for (Railcar el : array) {
		if (el.getMaxLoadWeight() == maxLoad) {
		    railcars[i++] = el;
		}
	    }
	    return railcars;
	} else {
	    return null;
	}
    }
}
