package com.shishonok.task07.model.util;

import com.shishonok.task07.model.util.interfaces.IList;

/**
 * Container class for working with <T> elements. Base on array. Have fix size,
 * which set by instantiation.
 * 
 * @version 1 17.06.2018
 * @author Alexander Shishonok
 * 
 */
public class MyUnchangeableList<T> implements IList<T> {

    protected static final int DEFAULT_INIT_SIZE = 8;
    protected Object[] array;
    protected int currentIndex;
    protected int maxElementIndex;

    public MyUnchangeableList() {
	this(DEFAULT_INIT_SIZE);
    }

    public MyUnchangeableList(int maxElementIndex) {
	if (maxElementIndex < 1) {
	    throw new IllegalArgumentException();
	}
	this.maxElementIndex = maxElementIndex;
	this.array = new Object[this.maxElementIndex];
	this.currentIndex = 0;
    }

    @Override
    public boolean add(T el) {
	if (currentIndex < maxElementIndex) {
	    array[currentIndex++] = el;
	    return true;
	}
	return false;
    }

    @Override
    public boolean add(T[] el) {
	if (maxElementIndex - currentIndex >= el.length) {
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

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
	if (index < 0 || index >= currentIndex) {
	    throw new IndexOutOfBoundsException();
	}
	return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) {
	if (index < 0 || index >= currentIndex) {
	    throw new IndexOutOfBoundsException();
	}
	Object temp = null;
	int endLoop = currentIndex - 1;
	for (int i = index; i < endLoop; i++) {
	    temp = array[i];
	    array[i] = array[i + 1];
	    array[i + 1] = temp;
	}
	temp = array[--currentIndex];
	array[currentIndex] = null;
	return (T) temp;
    }

    @Override
    public void swap(int i, int j) {
	Object temp = array[i];
	array[i] = array[j];
	array[j] = temp;

    }

    @Override
    public void clear() {
	array = new Object[maxElementIndex];
	currentIndex = 0;
    }

    @Override
    public int contains(T el) {
	for (int i = 0; i < currentIndex; i++) {
	    if (el.equals(array[i])) {
		return i;
	    }
	}
	return -1;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	for (int i = 0; i < size(); i++) {
	    builder.append("[").append(i).append("]-").append(array[i])
		    .append("\n");
	}
	return builder.toString();
    }

    // public T[] findBy(Function<T, Boolean> func) {
    // int count = 0;
    // for (int i = 0; i < currentIndex; i++) {
    // if (func.apply((T) array[i])) {
    // count++;
    // }
    // }
    // if (count != 0) {
    // Object[] temp = new Object[count];
    // int j = 0;
    // for (int i = 0; i < currentIndex; i++) {
    // if (func.apply((T) array[i])) {
    // temp[j++] = (T) array[i];
    // }
    // }
    // return (T[]) temp;
    // } else {
    // return null;
    // }
    // }
}
