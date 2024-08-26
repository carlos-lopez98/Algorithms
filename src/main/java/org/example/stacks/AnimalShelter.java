package org.example.stacks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first-in, first-out" bases.
 * People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can select
 * whether they would prefer a dog or a cat (and will receive the oldest animal of that type). They cannot
 * select which specific animal they would like. Create the data structures to maintain this system and implement
 * operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat. You may use the built-in LinkedList.
 */
public class AnimalShelter {

    public LinkedList<Animal> cats;
    public LinkedList<Animal> dogs;

    public AnimalShelter(){
        cats = new LinkedList<Animal>();
        dogs = new LinkedList<Animal>();
    }

    public void enQueue(Animal dogCat){
    if(dogCat == null){
        return;
    }

    if(dogCat instanceof Animal.Cat){
        cats.add(dogCat);
    }else{
        dogs.add(dogCat);
    }
    }

    public Animal deQueueAny(){

        Animal dequeue = null;

        if(!dogs.isEmpty() && !cats.isEmpty()){
            LocalDateTime timeArrivedCat = cats.peek().timeArrived;
            LocalDateTime timeArrivedDog = dogs.peek().timeArrived;
            dequeue = timeArrivedCat.isAfter(timeArrivedDog) ? dogs.removeFirst() : cats.removeFirst();
        }else if(!cats.isEmpty()){
            dequeue = cats.removeFirst();
        }else if(!dogs.isEmpty()){
            dequeue = dogs.removeFirst();
        }

        return dequeue;
    }

    public Animal.Cat deQueueCat(){
        if(cats.isEmpty()){
            return null;
        }
        return (Animal.Cat) cats.removeFirst();
    }

    public Animal.Dog deQueueDog(){
        if(dogs.isEmpty()){
            return null;
        }

        return (Animal.Dog) dogs.removeFirst();
    }
}
