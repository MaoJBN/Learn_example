
package com.mycompany.learn_exception;

public class Learn_exception {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double res = calculator.division(4, 0);
        System.out.println(res);
    }
}
