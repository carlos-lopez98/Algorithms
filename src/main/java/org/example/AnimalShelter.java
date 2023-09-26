package org.example;

/*
*
* An animal shelter, which holds only dogs and cats, operates on a strictly "first in first out" basis
* People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
* or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
* They cannot select a particular animal. Create the data structures to maintain this system and implement operations
* such as enqueue, dequeueany, dequeueDog, dequeueCat. You may use the built in linkedList data structure
*
* */
public class AnimalShelter {

    //Best way to do this, is to simply have two queues/linkedlists to store the animals
    //One for dogs and one for cats, since user can't select a specific animal we're only going to reference the front/heads of the lists
    //When dequeueing a dog, we'll pull from the dog structure and vice versa
    //When dequeueingAny, we'll peek into each list, and return whichever is older
    //When queueing we'll see what is being passed in, then add to the respective list
}
