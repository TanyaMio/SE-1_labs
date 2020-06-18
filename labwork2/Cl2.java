package com.lab111.labwork2;

/**
 * Class which implements interface "If2", contains field of "Cl3" type
 * and method  "meth2()"
 *
 * @author Diachenko Tetiana
 */

public class Cl2 implements If2 {


    /**
     * Field of "Cl3" type
     */
    Cl3 cl3;

    public static void main() {}

    /**
     * Implementation of abstract method from interface "If2"
     */
    @Override
    public void meth2() {
        System.out.println("This is method meth2() from interface If2 implemented in class Cl2");
    }
}
