package com.lab111.labwork4;

public class Main {

    public static void main(String[] args) {

        int ssx = 800;
        int ssy = 600;
        Adapter ad = new Adapter(ssx, ssy);

        System.out.println("Drawing Rectanle:\nScreen size: 800 x 600\nCoordinates relatively to center of the screen:\n\t(-200;150)\n\t(100;150)\n\t(100;-50)\n\t(-200;-50)");
        ad.drawRectangle(-200, 150, 100, 150, 100, -50, -200, -50);
    }

}
