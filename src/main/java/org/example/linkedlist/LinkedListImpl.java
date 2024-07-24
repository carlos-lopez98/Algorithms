package org.example.linkedlist;

/**
 *This class is to go over how to implement a linkedlist structure
 */

//Ask yourself what is needed in a linkedlist?
//How does a linkedlist work exactly?
//1. Linked lists have a head and tail node, the list can access at O(1) runtime
//2. LinkedLists must traverse from the head to get to a specific node/ data, unless it's a doubly linked list
//3. To remove a data point, you must remove the reference to that particular node in order to remove it from the list
public class LinkedListImpl<T> {

    private LinkedListNodeImpl<T> head;
    private LinkedListNodeImpl<T> tail;

    private int size;

    public T getHeadData(){
        return head.getData();
    }

    public T getTailData(){
        return tail.getData();
    }

    public int size(){
        return size;
    }

    public void addNode(LinkedListNodeImpl<T> node){
        if(head.getData() == null){
            head = node;
            tail = head;
        }else{
            LinkedListNodeImpl<T> next = head.getNext();
            head = node;
        }
    }

}
