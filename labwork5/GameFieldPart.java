package com.lab111.labwork5;

/**
 * The 'Colleague' class for the 'Mediator' pattern
 * @author Diachenlo Tetiana
 */
public class GameFieldPart {

    /**
     * Field for holding the board to which the part belongs.
     */
    GameField gamef;

    /**
     * Field that shows whether the part is busy
     */
    boolean busy = false;

    /**
     * Constructor
     * @param gf - the Game Field of which this object is a part
     */
    GameFieldPart(GameField gf) { this.gamef = gf;}

    /**
     * Method for freeing/occupying the part
     */
    void changeBusiness() {
        this.busy = !this.busy;
    }
}
