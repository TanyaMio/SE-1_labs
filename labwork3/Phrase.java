package com.lab111.labwork3;

/**
 * Realization of the 'Component' part of the Composite template
 * Abstract class, providing common interface for both EasyPhrase and ComplicatedPhrase objects.
 * @author Diachenko Tetiana
 */

public abstract class Phrase {

    /**
     * The default version of business method.
     */
    public void operation(){
        System.out.println("The 'operation' method from the Phrase abstract class.");
    }

}
