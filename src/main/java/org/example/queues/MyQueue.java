package org.example.queues;

/*
 * Implement a Queue
 * */

import org.example.Partition;

//A Queue has usually 4 methods, add() - adds node/ data to end of queue
//peek() lets you see first in line, remove() removes and returns first item in the queue
//isEmpty() checks to see if queue is empty
public class MyQueue<T> {
    private MyQueueNode<T> first;
    private MyQueueNode<T> last;

    //Adds new node, if first is null, then first and last are the same
    //Else last.next gets a node, then last moves to that node
    public void add(T data) {

        //Think about using OOP? What method can you use instead of the null check?
        //Think about the usage of the new nodes, you can place this once outside the methods...
        if (first == null) {
            MyQueueNode<T> temp = new MyQueueNode<>(data);
            first = temp;
            last = first;
        } else {
            MyQueueNode<T> temp = new MyQueueNode<>(data);
            last.next = temp;
            last = temp;
        }
    }

    public T remove() {
        if (first == null) {
            return null;
        } else {
            //This works, but think about how you can just, create a temp data variable, without having to create
            //a whole new node
            MyQueueNode<T> temp = new MyQueueNode<>(this.first.data);
            this.first = this.first.next;
            return temp.data;
        }
    }

    //Returns data of first node
    public T peek() {
        if (first == null) {
            return null;
        } else {
            return first.data;
        }
    }

    public boolean isEmpty() {
        return this.first == null;
    }
}



