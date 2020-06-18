package com.lab111.labwork7;

/**
 * The 'Memento' class for the 'Memento' pattern
 * @author Diachenlo Tetiana
 */
public class Memento {

    /**
     * Field for holding the state
     */
    private final String state;

    /**
     * Method for creating a new Memento
     * @param stateToSave - the state to be saved
     */
    public Memento(String stateToSave) {
        state = stateToSave;
    }

    /**
     * Method for returning the state saved
     * @return the saved state
     */
    public String getSavedState() {
        return state;
    }
}
