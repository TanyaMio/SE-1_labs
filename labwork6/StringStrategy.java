package com.lab111.labwork6;

/**
 * The 'ConcreteStrategy' class for the 'Mediator' pattern. Implements sorting for Strings
 * @author Diachenlo Tetiana
 */
public class StringStrategy implements Strategy {

    /**
     * Implementation of the 'Strategy' interface method. Sorts String Arrays
     * @param str - String Array to sort
     * @return sorted str
     */
    @Override
    public Object[] execute(Object[] str) {
        System.out.println("Executing strategy for an Array of Strings.");
        return str;
    }
}
