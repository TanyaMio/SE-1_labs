package com.lab111.labwork5;

public class Main {

    public static void main(String[] args) {

        GameField gf = new GameField(45, 30);

        System.out.println("\nTrying to create a piece at (6; 9)");
        try {
            gf.placePiece(6, 9);
        } catch (Exception e) {
            System.out.println("Invalid coordinates!");
        }
        System.out.println("\nTrying to create a piece at (90; 9)");
        try {
            gf.placePiece(90, 9);
        } catch (Exception e) {
            System.out.println("Invalid coordinates!");
        }
        System.out.println("\nTrying to create a piece at (34; 24)");
        try {
            gf.placePiece(34, 24);
        } catch (Exception e) {
            System.out.println("Invalid coordinates!");
        }


        System.out.println("\nTrying to move a piece to (17; 11)");
        try {
            gf.notify(6, 9, 17, 11);
        } catch (Exception e) {
            System.out.println("Invalid coordinates!");
        }
        System.out.println("\nTrying to move another piece to (17; 11)");
        try {
            gf.notify(34, 24, 17, 11);
        } catch (Exception e) {
            System.out.println("Invalid coordinates!");
        }
    }
}
