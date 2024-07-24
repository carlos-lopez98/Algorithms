package org.example.linkedlist;

//LinkedListNodeImpl - class to implement a singular node within a linked list

public class LinkedListNodeImpl<T> {

    private T data;
    private LinkedListNodeImpl<T> next;

    public LinkedListNodeImpl(T data){
        this.data = data;
    }

    public LinkedListNodeImpl(T data, LinkedListNodeImpl<T> next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedListNodeImpl<T> getNext() {
        return this.next;
    }

    public void setNext(LinkedListNodeImpl<T> next) {
        this.next = next;
    }
}
