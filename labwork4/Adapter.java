package com.lab111.labwork4;

/**
 * Adapter part of the Adapter pattern. Adapts coordinates for a Rectangle to coordinates for Line
 */
public class Adapter extends Line implements Rectangle{

    /**
     * Fields for the size of the screen to which to adapt
     */
    int ssx, ssy;

    Adapter(int x,int y){
        this.ssx = x;
        this.ssy = y;
    }

    /**
     * Method of adapting coordinates from a coordinate system with the beginning in the center of the screen
     * to the coordinate system with the beginning in the upper-left corner and Y axis upside-down
     * and drawing a rectangle using 4 lines with the new coordinates to match the interface of the Line
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     * @param x4
     * @param y4
     */
    public void drawRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        x1 = x1 + this.ssx/2;
        x2 = x2 + this.ssx/2;
        x3 = x3 + this.ssx/2;
        x4 = x4 + this.ssx/2;
        y1 = this.ssy/2 - y1;
        y2 = this.ssy/2 - y2;
        y3 = this.ssy/2 - y3;
        y4 = this.ssy/2 - y4;

        System.out.println("\nDrawing lines relatively to the upper-left corner:\n");
        drawLine(x1, y1, x2, y2);
        drawLine(x2, y2, x3, y3);
        drawLine(x3, y3, x4, y4);
        drawLine(x4, y4, x1, y1);
    }
}
