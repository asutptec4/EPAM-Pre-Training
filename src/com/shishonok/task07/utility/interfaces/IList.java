package com.shishonok.task07.utility.interfaces;

/**
 * The interface provides method for working with collection of elements
 * 
 * @version 1 14.06.2018
 * @author Alexander Shishonok
 * 
 * @param <T>
 *            type of element in collection
 */
public interface IList<T> {
    public boolean add(T el);

    public boolean add(T[] el);

    public int size();

    public boolean isEmpty();

    public T get(int index);

    public T remove(int index);

    public void clear();

    public int contains(T el);
}
