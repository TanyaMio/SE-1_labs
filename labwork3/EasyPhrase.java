package com.lab111.labwork3;

/**
 * Realization of the 'Leaf' part of the Composite template
 * @author Diachenko Tetiana
 */
public class EasyPhrase extends Phrase {

    /**
     * Field for variable name
     */
    String simple_phrase;
    /**
     * Field for constant value
     */
    double val;

    /**
     * Constructor for variable name
     */
    EasyPhrase(String phr){
        this.simple_phrase = phr;
    }
    /**
     * Constructor for constant value
     */
    EasyPhrase(double v){
        this.val = v;
    }

    /**
     * Realization of the business method for 'Leaf' elements
     */
    @Override
    public void operation() {
        System.out.println("The 'operation' method from the EasyPhrase class.");
    }
}
