package Search;

/**
 * Created by saraswathyneelakanta on 10/2/18.
 */

//preconditions: applicable only to sorted array
public class BinarySearch {



public static void main(String[] args){
    int[] test = {1,2,3,4,5};
    System.out.println(recursiveSearch(test, 0, test.length, 3));
    System.out.println(recursiveSearch(test, 0, test.length, 1));
    System.out.println(recursiveSearch(test, 0, test.length, 5));
    System.out.println(recursiveSearch(test, 0, test.length, 0));

    System.out.println("Iterative Search");

    System.out.println(iterativeSearch(test, 0, test.length, 3));
    System.out.println(iterativeSearch(test, 0, test.length, 1));
    System.out.println(iterativeSearch(test, 0, test.length, 5));
    System.out.println(iterativeSearch(test, 0, test.length, 0));

}

    public static int recursiveSearch(int[] array, int start, int end, int value){

        if(start >= end)
            return -1;

        int mid = (start+end)/2; //4/2 = 2 and 5/2 = 2.5
        //12345
        //1. if mid = value, return mid

                if(array[mid] == value)
                    return mid;
                //2. if mid
                else if(array[mid]> value){
                    return recursiveSearch(array, start, mid, value);
                }
                else{
                    return recursiveSearch(array, mid+1, end, value);
                }
    }

    public static int iterativeSearch(int[] array, int start, int end, int value) {

        while(start < end){

            int midpoint = (start+end)/2;

            if(value == array[midpoint])
                return midpoint;

            else if(value < array[midpoint])
                    end = midpoint;

            else if(value > array[midpoint])
                    start = midpoint+1;
        }

        return -1;
    }


}
