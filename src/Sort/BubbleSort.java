package Sort;

/**
 * Created by saraswathyneelakanta on 10/2/18.
 */
public class BubbleSort {

    public static void main(String[] args) {

       // int[] array = {3, 5, 2, 1, 4};
        int[] array = {3,5};

        String str = String.valueOf(5);

        int[] result = bubbleSort(array);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }


    //sorted Array length is zero
    //unsorted array length is array.length


    // make sorted array length as 1;
    private static int[] bubbleSort(int[] array){

        for(int unsortedArrayLength=array.length-1;unsortedArrayLength>=0;unsortedArrayLength--) {

            for (int i = 0; i <= unsortedArrayLength-1; i++) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }


    private static int[] bubblesortTwo(int[] array){
        for(int j=0;j<array.length;j++){

            for(int i=0;i<array.length-1;j++){

            }
        }
    }
}
