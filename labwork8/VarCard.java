package com.lab111.labwork8;

/**
 * The 'Singleton' class for the 'Singleton' pattern
 * @author Diachenlo Tetiana
 */
public class VarCard {

    /**
     * Field for holding the one instance of the class
     */
    private static VarCard varCard;

    /**
     * Constructor for the variable card
     */
    private VarCard (){ }

    /**
     * Method that provides access to the instance of the class
     * @return the only instance of the variable card
     */
    public static VarCard getInstance(){
        if (varCard == null){
            varCard = new VarCard();
        }
        return varCard;
    }
}
