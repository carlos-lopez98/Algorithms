package org.example.stacks;

/*
*
* How would you design a stack which, in addition to push and pop, has a function min
* which returns the minimum element? Push, pop and min should all operate in O(1) time.
*
* */

public class StackMin {

}

/**
 * This one would be easy you just create an extra variabe besides top
 *
 * You could call this one min, everytime you push to the stack you just verify if this new value is the new min
 * Then if it is set it equal to min.
 *
 * Then when calling min, you just return the min value, this won't be able to pop() thoush, as the min value can be
 * In a position not at the top of our stack
 *
 * What happens when the min value is popped? How would you keep track of the new min value?
 */