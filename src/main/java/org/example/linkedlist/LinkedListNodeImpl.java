package org.example.linkedlist;

//LinkedListNodeImpl - class to implement a singular node within a linked list

public class LinkedListNodeImpl<T> {

    private T data;
    private LinkedListNodeImpl next;

    public LinkedListNodeImpl(T data){
        this.data = data;
    }

    public LinkedListNodeImpl(T data, LinkedListNodeImpl next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNodeImpl getNext() {
        return next;
    }

    public void setNext(LinkedListNodeImpl next) {
        this.next = next;
    }
}
