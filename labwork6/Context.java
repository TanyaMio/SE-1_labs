package com.lab111.labwork6;

/**
 * The 'Context' class for the 'Mediator' pattern. Determines the strategy that will be used
 * @author Diachenlo Tetiana
 */
public class Context {

    /**
     * Field to hold the strategy
     */
    private Strategy strategy;

    /**
     * Constructor
     * @param strategy - strategy to use
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Method to execute chosen strategy
     * @param obj - array of Objects
     * @return obj, sorted using the strategy
     */
    public Object[] executeStrategy(Object[] obj) {
        return strategy.execute(obj);
    }
}
