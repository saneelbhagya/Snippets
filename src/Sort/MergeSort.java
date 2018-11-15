package Sort;

/**
 * Created by saraswathyneelakanta on 10/11/18.
 *
 * Algorithm:
 * divide the list into two sublists
 * sort the sublists
 * merge the sublists
 */
public class MergeSort {

//Big o is nlogn in worst case
// space complexity is o(n), this is not in-place(in place takes constant space)

    public static void main(String[] args){
        int[] array = {3, 5, 9, 0};
        int[] temp = new int[array.length];

        mergesort(array, temp, 0,array.length-1); //here you need to give array.length-1 because we are
        //talking in terms of index, so please do not give the size of the array.

        for(int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }


    }

    public static void mergesort(int[] array, int[] temp, int start, int end){
        //1. check to see if the list has more than one element.
       // if(array.length < 2)   //todo correction(mistake): you need to say it in another way,
        // todo :bcos array keeps changing start and end indexes, so its an hint to make it dependent on the indexes.
           if(start >= end)
              return;

        // calculate the midpoint
      //  int mid = array.length/2;    todo: this is a mistake please make dynamic, again need to depend on indexes.

        int mid = (start+end)/2;

        mergesort(array, temp, start, mid);
        mergesort(array, temp, mid+1, end);

        merge(array,temp,start,mid, end);
    }


    public static void merge(int[] array, int[] temp, int start,int mid, int end) {

        int newPtr = start;
        int left = start;
        int right = mid+1;

        while (left <= mid && right <= end) {
            if (array[start] < array[right]) {
                temp[newPtr] = array[left];
                left++;

            } else {
                temp[newPtr] = array[right];
                right++;
            }
            newPtr++;
        }

        while(left <= mid) {
            temp[newPtr++] = array[left++];

        }

        while(right <= end) {
            temp[newPtr++] = array[right++];
        }

        for(int i=start;i<=end;i++){
            array[i] = temp[i];
        }
    }

}
