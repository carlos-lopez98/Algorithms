package org.example.stacks;

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






    }

    public Animal.Cat deQueueCat(){


    }

    public Animal.Dog deQueueDog(){


    }
}
