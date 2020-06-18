package com.lab111.labwork4;

/**
 * The 'Adaptee' part of Adapter pattern. Class of a Line.
 * @author Diachenko Tetiana
 */
public class Line {

    /**
     * Method of drawing a line from coordinates (x1, y1) to (x2, y2) in coordinate system with the beginning in the upper-left corner and Y axis upside-down
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public void drawLine(int x1, int y1, int x2, int y2){
        System.out.printf("Drawing line from (%d;%d) to (%d;%d)\n", x1, y1, x2, y2);
    }
}
