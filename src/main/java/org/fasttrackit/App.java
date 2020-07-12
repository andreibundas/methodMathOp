package org.fasttrackit;


public class App {

    public static void main(String[] args) {

        // sum
        Operations refOperation = new Operations();
        int sum = refOperation.operation(5, 7);
        System.out.println("The sum of nrOne and nrTwo is: " + sum);

        // sum - overloading
        Operations refOperation1 = new Operations();
        double sum2 = refOperation1.operation(5.5,2.3);
        System.out.println(" Overloading: The sum of nrOne and nrTwo is: " + sum2);

        // subtracting
        Operations refOperation2 = new Operations();
        int substraction = refOperation2.operation2(8, 4);
        System.out.println("The substraction of nrOne from nrTwo is: " + substraction);

        // subtracting - overloading
        Operations refOperation22 = new Operations();
        double substraction2 = refOperation22.operation2(6.7, 5.4);
        System.out.println("Overloading: The substraction of nrOne from nrTwo is: " + substraction2);

        // multiplying
        Operations refOperation3 = new Operations();
        int multiply = refOperation3.operation3(3, 4);
        System.out.println("The multuply of nrOne and nrTwo is: " + multiply);
        // multiplying - overloading
        Operations refOperation33 = new Operations();
        double multiply2 = refOperation33.operation3(4.3, 2.9);
        System.out.println("Overloading: The multuply of nrOne and nrTwo is: " + multiply2);

        // division
        Operations refOperation4 = new Operations();
        int division = refOperation4.operation4(4,2);
        System.out.println("The division of nrOne and nrTwo is: " + division);

        // division - overloading
        Operations refOperation44 = new Operations();
        double division2 = refOperation44.operation4(5.4,2.2);
        System.out.println("Overloading: the division of nrOne and nrTwo is: " + division2);

    }
}

