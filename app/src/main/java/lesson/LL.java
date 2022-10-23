package lesson;

/**
 * DO NOT MODIFY
 */
public interface LL<T> {

    /**
     * Appends the specified element to the front of this list. 
     * If we have a list such as: A->B->C and we call add(X) our
     * list would look like X->A->B->C
     * @param e The object to add
     */
    void add(T e);

    /**
     * Removes the element at the specified position in this list. If the index
     * does not exist then we will just return null.
     * @param index The index of the object to remove
     * @return the element previously at the specified position or null
     */
    T remove(int index);

    /**
     * Returns the element at the specified position in this list.
     * @param index
     * @return the element at the specified position in this list
     */
    T get(int index);

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Removes all of the elements from this list
     */
    void clear();

    /**
     * Returns the number of elements currently in this list.
     * @return the number of elements
     */
    int getSize();

}
