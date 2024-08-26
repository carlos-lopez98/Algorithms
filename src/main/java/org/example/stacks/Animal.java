package org.example.stacks;

import java.time.LocalDateTime;

/**
 * Class is needed for Animal Shelter Problem
 */
public class Animal {

    public LocalDateTime timeArrived;

    public class Dog extends Animal{

        public Dog(LocalDateTime timeArrived){
            this.timeArrived = timeArrived;
        }
    }

    public class Cat extends Animal{

        public Cat(LocalDateTime timeArrived){
            this.timeArrived = timeArrived;
        }
    }

}
