package com.lab111.labwork2;

/**
 * Class which implements interface "If3" and contains methods "meth2()" and "meth3()"
 *
 * @author Diachenko Tetiana
 */

public class Cl3 implements If3 {

    public static void main() {}

    /**
     * Implementation of abstract method from interface "If2"
     */
    @Override
    public void meth2() { System.out.println("This is method meth2 from interface If2 implemented in class Cl3"); }

    /**
     * Implementation of abstract method from interface "If3"
     */
    @Override
    public void meth3() {
        System.out.println("This is method meth3 from interface If3 implemented in class Cl3");
    }
}
