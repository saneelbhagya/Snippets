package problems;

/**
 * Created by saraswathyneelakanta on 10/19/18.
 */
public class Reverse {

    //Reverse your name Madam.

    public static void main(String[] args){

        System.out.println(reverse("tadpi"));

    }

    public static String reverse(String str){

        char[] charArr = str.toCharArray();

        int mid = charArr.length/2;

        for(int i=0;i<mid;i++){
            //swap
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length-1-i];   //you made mistakes at this index. same mistakes again and again. visualize index properly.
            charArr[charArr.length-1-i] = temp;
        }

        return new String(charArr);

        //here charArr.toString does not work, it prints memory address.

    }
}
