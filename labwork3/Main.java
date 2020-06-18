package com.lab111.labwork3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ComplicatedPhrase cp = new ComplicatedPhrase();
        ComplicatedPhrase cp2 = new ComplicatedPhrase();
        EasyPhrase ep1 = new EasyPhrase("My easy Phrase");
        EasyPhrase ep2 = new EasyPhrase(5.0);

        cp.add(ep1);
        cp.add(ep2);
        cp.add(cp2);

        ArrayList<Phrase> children1 = cp.getChildren();
        System.out.println("All 3 children added:");
        for(int i = 0; i < children1.size(); i++) {
            System.out.println(children1.get(i));
        }

        cp.remove(ep2);

        ArrayList<Phrase> children2 = cp.getChildren();
        System.out.println("\nOne child removed:");
        for(int i = 0; i < children2.size(); i++) {
            System.out.println(children2.get(i));
        }

        System.out.println("\nTesting method realizations:");
        cp.operation();
        ep1.operation();
    }
}
