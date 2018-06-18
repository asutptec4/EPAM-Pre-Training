package com.shishonok.task07.utility;

public class MyChangeableList<T> extends MyUnchangeableList<T> {

    protected static final int DEFAULT_SIZE_MULTIPLIER = 2;

    public MyChangeableList() {
	this(DEFAULT_INIT_SIZE);
    }

    public MyChangeableList(int maxElementIndex) {
	if (maxElementIndex < 1) {
	    throw new IllegalArgumentException();
	}
	this.maxElementIndex = maxElementIndex;
	this.array = new Object[this.maxElementIndex];
	this.currentIndex = 0;
    }

    @Override
    public boolean add(T el) {
	if (currentIndex >= maxElementIndex) {
	    resize();
	}
	return super.add(el);
    }

    @Override
    public boolean add(T[] el) {
	if (maxElementIndex - currentIndex <= el.length) {
	    resize();
	}
	return super.add(el);
    }

    @Override
    public void clear() {
	maxElementIndex = DEFAULT_INIT_SIZE;
	super.clear();
    }

    private void resize() {
	maxElementIndex = array.length * DEFAULT_SIZE_MULTIPLIER;
	Object[] tempArray = new Object[maxElementIndex];
	for (int i = 0; i < array.length; i++) {
	    tempArray[i] = array[i];
	}
	array = tempArray;
    }

}
