package org.fasttrackit;


public class Operations {

    //method for sum
    public int operation (int nrOne, int nrTwo){
        return nrOne + nrTwo;
    }
    // overloading - method for sum
    public double operation (double nrOne, double nrTwo){
        return nrOne + nrTwo;
    }


    //method for subtraction
    public int operation2 (int nrOne, int nrTwo){
        return nrOne - nrTwo;
    }
    // overloading -  method for subtraction
    public double operation2 (double nrOne, double nrTwo){
        return nrOne - nrTwo;
    }

    //method for multiplying
    public int operation3 (int nrOne, int nrTwo){
        return nrOne * nrTwo;
    }
    // overloading - method for multiplying
    public double operation3 (double nrOne, double nrTwo) {
        return nrOne * nrTwo;
    }

        //method for division
        public int operation4 (int nrOne, int nrTwo) {
            return nrOne / nrTwo;
        }

    // overloading - method for division
    public double operation4 (double nrOne, double nrTwo) {
        return nrOne / nrTwo;
    }

}
