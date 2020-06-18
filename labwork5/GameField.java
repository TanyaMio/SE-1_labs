package com.lab111.labwork5;

/**
 * The 'ConcreteMediator' class for the 'Mediator' pattern
 * @author Diachenlo Tetiana
 */
public class GameField implements Mediator {

    /**
     * Field to store Colleagues
     */
    private GameFieldPart[][] parts;

    /**
     * Fields for holding Game Field parameters
     */
    private int length;
    private int width;

    /**
     * Constructor
     * @param l - Length of the Game Field
     * @param w - Width of the Game Field
     */
    GameField(int l, int w){
        if (l > 0 && w > 0) {
            this.length = l;
            this.width = w;
            this.parts = new GameFieldPart[w][l];
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < l; j++) {
                    this.parts[i][j] = new GameFieldPart(this);
                }
            }
            System.out.println("\nThe " + this.length + "x" + this.width + " game field was created.");
        } else {System.out.println("Invalid size.");}
    }

    /**
     * Method realization from 'Mediator' interface. Notifies both parts needed for the move
     */
    @Override
    public void notify(int x1, int y1, int x2, int y2) throws Exception {
        if (this.parts[y1-1][x1-1].busy && !this.parts[y2-1][x2-1].busy) {
            this.parts[y1-1][x1-1].changeBusiness();
            this.parts[y2-1][x2-1].changeBusiness();
            System.out.println("Successfully moved the piece from (" + x1 + "; " + y1 + ") to (" + x2 + "; " + y2 + ").");
        } else {
            System.out.print("Couldn't move the piece.");
            if(!this.parts[y1-1][x1-1].busy) { System.out.print("There is no piece at the starting part.");} else {
                System.out.print("The destination is occupied by another piece.");
            }
        }
    }

    /**
     * Method to place a Game Piece on the board
     */
    public void placePiece(int x, int y) throws Exception {
        if (!this.parts[y-1][x-1].busy) {
            this.parts[y-1][x-1].changeBusiness();
            System.out.println("Successfully placed the piece at (" + x + "; " + y + ").");
        } else {
            System.out.print("Couldn't move the piece. The destination is occupied by another piece.");
        }
    }
}
