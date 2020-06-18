package com.lab111.labwork6;

public class Main {

    public static void main(String[] args) {

        Context context;
        String[] str = {"Apple", "Banana", "Cucumber", "Plum"};
        Integer[] intr = {4, 59, 654, 8, 0};

        context = new Context(new StringStrategy());
        context.executeStrategy(str);

        context = new Context(new IntStrategy());
        context.executeStrategy(intr);
    }


}
