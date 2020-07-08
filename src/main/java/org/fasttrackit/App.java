package org.fasttrackit;


public class App {

    public static void main(String[] args) {


        // sum
        Operations refOperation = new Operations();
        int sum = refOperation.operation(5, 7);
        System.out.println("The sum of nrOne and nrTwo is: " + sum);


        // subtracting
        Operations refOperation2 = new Operations();
        int substraction = refOperation2.operation2(8, 4);
        System.out.println("The substraction of nrOne from nrTwo is: " + substraction);


        // multiplying
        Operations refOperation3 = new Operations();
        int multiply = refOperation3.operation3(3, 4);
        System.out.println("The multuply of nrOne and nrTwo is: " + multiply);


        // division
        Operations refOperation4 = new Operations();
        double division = refOperation4.operation4(17, 5);
        System.out.println("The division of nrOne and nrTwo is: " + division);

    }
}

