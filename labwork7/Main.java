package com.lab111.labwork7;

import java.util.ArrayList;
import java.util.List;

/**
 * The 'Caretaker' class for the 'Memento' pattern
 * @author Diachenlo Tetiana
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Field for holding Mementos of saved states
         */
        List<Memento> savedStates = new ArrayList<Memento>();
        /**
         * Creating a character
         */
        Character character = new Character("Pete");
        /**
         * Setting states
         */
        character.set("\n\tInventory: Sword, Shield, Gold, Potion\n\tHP: 350\n\tPosition:(167; 235)");
        character.set("\n\tInventory: Sword, Shield, Gold\n\tHP: 750\n\tPosition:(167; 235)");
        /**
         * Saving a state
         */
        savedStates.add(character.saveToMemento());
        /**
         * Setting another state
         */
        character.set("\n\tInventory: Sword, Gold, Potion\n\tHP: 750\n\tPosition:(753; 455)");
        /**
         * Saving new state
         */
        savedStates.add(character.saveToMemento());
        /**
         * Setting another state
         */
        character.set("\n\tInventory: Sword, Gold\n\tHP: 1150\n\tPosition:(837; 137)");
        /**
         * Restoring previous state
         */
        character.restoreFromMemento(savedStates.get(1));
    }
}
