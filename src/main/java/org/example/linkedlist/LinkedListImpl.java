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

    //This add method is only adding the new nodes to the beginning of the
    //linkedlist
    public void addData(T data){

        LinkedListNodeImpl temp = new LinkedListNodeImpl(data);

        if(isEmpty()){
            head = temp;
            tail = head;
        }else{
            temp.setNext(head);
            head = temp;
            size++;
        }
    }

    //We're deleting the node that contains this data
    //Edge Cases: what if head is null?
    //How would you remove just the head node?
    public void remove(T data){
        //If the linkedlist is empty just return
        if(isEmpty()){
            return;
        }

        if(head.getData() == data){
            head = head.getNext();
            size--;
        }else{
            LinkedListNodeImpl previousNode = head;
            LinkedListNodeImpl currentNode = head.getNext();

            while(currentNode.getData() != data){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            }
            previousNode.setNext(currentNode.getNext());
            size--;
        }
    }


    public boolean isEmpty(){

        if(size == 0){
            return true;
        }

        return false;
    }
}
