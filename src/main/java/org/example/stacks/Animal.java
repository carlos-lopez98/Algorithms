package org.example.stacks;

import java.time.LocalDateTime;

/**
 * Class is needed for Animal Shelter Problem
 */
public class Animal {

    LocalDateTime timeArrived;

    public class Dog extends Animal{

        Dog(LocalDateTime timeArrived){
            this.timeArrived = timeArrived;
        }
    }

    public class Cat extends Animal{

        Cat(LocalDateTime timeArrived){
            this.timeArrived = timeArrived;
        }
    }

}
