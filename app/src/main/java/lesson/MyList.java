package lesson;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<T> implements LL<T>, Iterable<T>{

    /**
     * Private inner class to represent nodes in our linked list
     */
    private class Node{
        public T data;
        public Node next = null;
        public Node prev = null;
        public Node(T e) {
            this.data = e;
        }
    }

    /**
     * The head of our list. Our list will be a singly linked list with only
     * one entry point which is maintained by the head pointer.
     */
    private Node head = null;
    /**
     * Store the current number of elements in this list
     */
    private int size = 0;


    @Override
    public void add(T e) {
        Node n = new Node(e);
        //If head is null this means we are adding our first item to the list
        //so we just need to set head to the new node
        if(head == null){
            head = n;
        }else{
            //If head is not null that means we already have elements in this
            //list so just add the new one to the front
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }



    @Override
    public T get(int index) {
        //Just return null if head is null because that means we don't have
        //any items in the list
        if(head == null) return null;

        //If we are asked to get an index that is bigger than the size of our
        //list then we just return null because that index does not exist.
        if(index > size) return null;

        //We don't support negative indexes
        if(index < 0) return null;

        //Walk the list until we get to the requested element when this loop
        //ends we should be on the requested index.
        Node curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        //We want to return a reference to the data that the list contains
        //but still retain the data in the list until the user calls remove
        return curr.data;
    }

    @Override
    public T remove(int index) {
        // TODO Implement this method using the get and add method as a reference
        // You will need to update the next and prev pointers in the list.
    }

    @Override
    public boolean isEmpty() {
        // TODO Implement this method
    }

    @Override
    public void clear() {
        // TODO Implement this method
    }

    @Override
    public int getSize(){
        //TODO Implement this method
    }

    /**
     * Implements the iterator interface defined here: 
     * https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
     */
    private class MyIterator implements Iterator<T>{

        /**
         * The current node that we are pointing to.
         */
        private Node curr = head;

        @Override
        public boolean hasNext() {
            //If curr is null that means we have no more items in the list;
            return curr != null;
        }

        @Override
        public T next() {
            //TODO Implement. Need to return curr.data!
        }

    }

    @Override
    public Iterator<T> iterator() {
        //Returns a new iterator that is initialized to the lists head node.
        return new MyIterator();
    }

}

