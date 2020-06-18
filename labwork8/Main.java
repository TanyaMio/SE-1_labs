package com.lab111.labwork8;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Expression expression = new Expression("2x + 1 = 5");
        calculator.calculate(expression, VarCard.getInstance());

        Expression expression2 = new Expression("6y + 1 = 5");
        calculator.calculate(expression2, VarCard.getInstance());
    }
}
