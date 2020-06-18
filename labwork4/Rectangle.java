package com.lab111.labwork4;

/**
 * Target interface of Adapter pattern. Draws a rectangle.
 */
public interface Rectangle {

    /**
     * Method of drawing a rectangle given dots (x1, y1), (x2, y2), (x3, y3), (x4, y4) in coordinate system with the beginning in the center of the screen
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3
     * @param x4
     * @param y4
     */
    public void drawRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4);
}
