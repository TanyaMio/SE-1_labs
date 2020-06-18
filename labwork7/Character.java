package com.lab111.labwork7;

/**
 * The 'Originator' class for the 'Memento' pattern
 * @author Diachenlo Tetiana
 */

class Character {

    /**
     * Field for holding character name
     */
    private String name;
    /**
     * Field for holding current character state
     */
    private String state;

    /**
     * Constructor for a new Character
     * @param n - name of the character
     */
    public Character(String n) {
        this.name = n;
    }

    /**
     * Method for setting character state
     * @param state - state to set for the character
     */
    public void set(String state) {
        System.out.println("Character " + this.name + ": Setting state to: " + state + "\n");
        this.state = state;
    }

    /**
     * Method for saving current state into a Memento
     * @return Memento with the saved state
     */
    public Memento saveToMemento() {
        System.out.println("Character " + this.name + ": Saving to Memento.\n");
        return new Memento(this.state);
    }

    /**
     * Method for restoring a previously saved state from a Memento
     * @param memento Memento holding the state to be restored
     */
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Character " + this.name + ": State after restoring from Memento: " + this.state + "\n");
    }

}
