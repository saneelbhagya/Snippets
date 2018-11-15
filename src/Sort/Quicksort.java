package Sort;

/**
 * Created by saraswathyneelakanta on 10/16/18.
 * Average case- O(nlogn)
 * Worst case-O(n^2 )
 * Space complexity is In-place which is constant
 * many library implementation is usually quicksort alogorithm.
 */
public class Quicksort {

    // 1. partition by selecting pivot
    // put  all elements less than pivot on lhs
    //put all the elements greater than pivot on right hand side


    public static void main(String[] args) {
        int[] array = {0, 4, 5, 6, 7, 1, 2, 3};

        quickSort(array, 0, array.length-1);

        for(int k=0;k< array.length;k++){
            System.out.println(array[k]);
        }
    }


    private static void quickSort(int[] arr, int low, int high) {


        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {

        int pivot = array[high];
        int i = low-1;
       // int j = low

                for(int j=low; j< high;j++){
                    if(array[j]<= array[high]){
                        i++;
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }

                int t = array[i+1];
                array[i+1] = array[high];
                array[high] = t;
                return (i+1);
    }
}