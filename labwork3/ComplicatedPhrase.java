package com.lab111.labwork3;

import java.util.ArrayList;

/**
 * Realization of 'Composite' part of the Composite template
 * @author Diachenko Tetiana
 */
public class ComplicatedPhrase extends Phrase {

    /**
     * Field for children
     */
    ArrayList<Phrase> children = new ArrayList<Phrase>();

    /**
     * Method for adding a new child to the object
     * @param c - child to add
     */
    public void add(Phrase c) {
        this.children.add(c);
    }

    /**
     * Method for removing a child from the object
     * @param c - child to remove
     */
    public void remove(Phrase c) {
        this.children.remove(c);
    }

    /**
     * Method for accessing children of the object
     * @return children
     */
    public ArrayList<Phrase> getChildren() {
        return this.children;
    }

    /**
     * Realization of the business method for 'Composite' elements
     */
    @Override
    public void operation() {
        System.out.println("The 'operation' method from the ComplicatedPhrase class.");
    }
}
