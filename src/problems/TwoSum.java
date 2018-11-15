package problems;

import java.util.Arrays;

/**
 * Created by saraswathyneelakanta on 11/6/18.
 */
public class TwoSum {

    //Given an unsorted array of integers, find pair for a given sum.

    //a = {3,4,7,8,1,2,3,4}  sum = 7

    public static void main(String[] args){
        int[] a = {3,4,7,8,1,2,3,4};
        int sum = 7;
        int[] result = getInputs(a, sum);

       // for(int k=0;k<result.length;k++){
         //   System.out.println(result[k]);
        //}

        for(int p:a){
            System.out.println("this is p: "+ p);
        }
    }

    public static int[] getInputs(int[] a, int sum){

        //1. Approach 2for loops, n2
       // i =0 i < a.length-1
       // j= i+1 j= a.length.length-1

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<=a.length-1;j++){
                if ((a[i] + a[j]) == sum){
                    return new int[] {a[i],a[j]};
                }
            }
        }

        return new int[]{-1, -1};
    }

    //Approach 2
    //i -> 0  to <j
    //j = a.length-1


   // int[] a = {3,4,7,8,1,2};
   // a = {1,2,3,4,7,8}
     // a = {}

    public static int[] getInputsTwo(int[] a, int sum){

        Arrays.sort(a);

        int j= a.length-1;
        for(int i=0;i< j;j++){
            if((a[j]+a[i]) == sum){
                return new int[]{a[i], a[j]};
            }
            if((a[j]+a[i])>sum){
               j--;
            }

        }

    return new int[] {-1, -1};
    }


}
