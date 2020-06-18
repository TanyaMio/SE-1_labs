package com.lab111.labwork2;

/**
 * Class which implements interface "If1", extends class "Cl2", contains fields of "If1" and "If2" types
 * and methods "meth1()" and "meth2()"
 *
 * @author Diachenko Tetiana
 */

public class Cl1 extends Cl2 implements If1 {

    /**
     * Fields of "If1" and "If2" types
     */
    If1 if1;
    If2 if2;

    public static void main() { }

    /**
     * Implementation of abstract method from interface "If1"
     */
    @Override
    public void meth1() { System.out.println("This is method meth1() from interface If1 implemented in class Cl1");
    }

    /**
     * Implementation of abstract method from interface "If3"
     */
    @Override
    public void meth3() { System.out.println("This is method meth3() from interface If3 implemented in class Cl1"); }

}
