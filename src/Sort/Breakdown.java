package Sort;

/**
 * Created by saraswathyneelakanta on 10/11/18.
 */
public class Breakdown {

    public static void main(String[] args) {

        int[] array = {3, 5, 2, 1, 4};

        divideRecursively(array,0, array.length-1);

    }


    public static void divideRecursively(int[] array, int start, int end){
        if(start >= end){
            System.out.println("Start: " +start+ " End: " +end);
        }
        else {
            int mid = (start+end)/2;
            divideRecursively(array,start,mid);
            divideRecursively(array,mid+1,end);
        }
    }

}
