package Recursion;

/**
 * Created by saraswathyneelakanta on 10/11/18.
 * For example, suppose we want to sum the integers from 0 to some value n:n=100
 */
public class Summation {

    public static void main(String[] args){

        System.out.println(recursiveSum(100));
    }

   //int is 4 byte or 32 bit
    public static int recursiveSum(int data){

        //1. base case
        if(data < 1)
            return 0;
        else
            return data+recursiveSum(data-1);

    }
}
