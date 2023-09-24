package org.example;

/*
*
* How would you design a stack which, in addition to push and pop, has a function min
* which returns the minimum element? Push, pop and min should all operate in O(1) time.
*
* */

public class StackMin {
    //In order to do this you need a way to find the minimum
    //You can store the minimum value as an int, in your stack

    //Second Method, is two implement one stack for tracking all your values
    //Another stack keeps track of only minimum, when you add a new value
    //You do a stack_min.peek() to get your most recent minimum, and if this new value
    //is lower then or equal to you push to all values and min stack -- you want to do the equal check
    //to account for multiple duplicates, IE if you have 2,2,2,2 your min stack should also look like 2,2,2,2


}
