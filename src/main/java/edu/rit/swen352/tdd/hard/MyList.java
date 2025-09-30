package edu.rit.swen352.tdd.hard;

import java.util.NoSuchElementException;

/**
 * MyList is a flexible-sized sequence of elements with no gaps.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor: with varargs of initial elements</li>
 *   <li>isEmpty: queries if the list is empty</li>
 *   <li>size: queries how many elements in the list</li>
 *   <li>get: returns the element at a specific index;
 *     throw {@link java.util.NoSuchElementException} if the index is outside the size of the list</li>
 *   <li>add: add an element to the end of the list; nulls not allowed</li>
 *   <li>remove: remove an element by index</li>
 *   <li>forEach: iterates over each element and executes the {@link java.util.function.Consumer} parameter</li>
 * </ul>
 *
 * @param <T> the type of elements in the list.
 */
public class MyList<T> {

    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void add(T element) {
        elements[size++] = element;
    }

    public T get(int index) {
        if(index < 0 || index >= size){
            throw new NoSuchElementException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }
}
