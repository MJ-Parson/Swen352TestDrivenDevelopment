package edu.rit.swen352.tdd.hard;

/**
 * MySet is a flexible-sized, unordered collection of elements.
 * The {@link Object#equals(Object)} method is used to determine if two values are equal.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor: with varargs of initial elements</li>
 *   <li>isEmpty: queries if the set is empty</li>
 *   <li>size: queries how many elements in the set</li>
 *   <li>contains: queries whether the supplied object exists (by equality) in the set</li>
 *   <li>add: add an element to the set; no-op if the element is already in the set (by equality)</li>
 *   <li>remove: remove an element by equality</li>
 *   <li>map: creates a new set where each element is transformed by a {@link java.util.function.Function}</li>
 *   <li>NFR: the {@code contains} method executes in O(1) (<em>constant</em>) time</li>
 * </ul>
 *
 * @param <T> the type of elements in the set.
 */
public class MySet<T> {
    private static final int INITIAL_CAPACITY = 16;
    private Object[] elements;
    private int size;

    @SafeVarargs
    public MySet(T... elements) {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
        for (T element : elements) {
            this.elements[size++] = element;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void add(T element) {
        throw new UnsupportedOperationException("NYI");
    }


}
