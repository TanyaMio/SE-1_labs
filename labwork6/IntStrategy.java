package com.lab111.labwork6;

/**
 * The 'ConcreteStrategy' class for the 'Mediator' pattern. Implements sorting for Integers
 * @author Diachenlo Tetiana
 */
public class IntStrategy implements Strategy {

    /**
     * Implementation of the 'Strategy' interface method. Sorts Integer Arrays
     * @param intr - Integer Array to sort
     * @return sorted intr
     */
    @Override
    public Object[] execute(Object[] intr) {
        System.out.println("Executing strategy for an Array of Integers.");
        return intr;
    }

}
