package org.example.queues;

public class MyQueueNode<T> {
    public T data;
    public MyQueueNode<T> next;

    public MyQueueNode (T data){
        this.data = data;
    }
}
