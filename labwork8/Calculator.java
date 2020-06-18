package com.lab111.labwork8;

/**
 * The 'Calculator' class for calculating algebraic expressions
 * @author Diachenlo Tetiana
 */
public class Calculator {

    /**
     * Constructor for a new instance of the calculator
     */
    public Calculator() {}

    /**
     * Method to calculate algebraic expressions
     * @param ex - expression to calculate
     * @param vc - variable card to use for calculation
     */
    public void calculate(Expression ex, VarCard vc) {
        System.out.println("Calculating expression: " + ex.expr + "...\nUsing variable card " + vc.getInstance() + "\n");
    }
}
