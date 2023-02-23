package src.assignment5;

import java.util.Arrays;

//Question 4
public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        if (arr.length == 0) {
            return arr;
        } else {
            int[] reversedArr = new int[arr.length];
            reversedArr[0] = arr[arr.length - 1];
            int[] subArr = Arrays.copyOfRange(arr, 0, arr.length - 1);
            int[] reversedSubArr = reverseArray(subArr);
            System.arraycopy(reversedSubArr, 0, reversedArr, 1, reversedSubArr.length);
            return reversedArr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] reversedArr = reverseArray(arr);
        System.out.println(Arrays.toString(reversedArr));

    }
}
