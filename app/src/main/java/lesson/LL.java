package lesson;

/**
 * DO NOT MODIFY
 */
public interface LL {

    /**
     * Appends the specified element to the end of this list 
     * @param e The object to add
     */
    void add(Object e);

    /**
     * Inserts the specified element at the specified position in this list
     * @param index The index to insert at
     * @param element the object to add
     */
    void add(int index, Object element);

    /**
     * Returns the element at the specified position in this list.
     * @param index
     * @return the element at the specified position in this list
     */
    Object get(int index);

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if
     * this list does not contain the element.
     * @param o The object to find
     * @return the index of the first occurrence of the specified element in this list, or -1 if
     * this list does not contain the element
     */
    int indexOf(Object o);

    /**
     * Removes the element at the specified position in this list
     * @param index The index of the object to remove
     * @return the element previously at the specified position
     */
    Object remove(int index);

    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * Removes all of the elements from this list
     */
    void clear();

}