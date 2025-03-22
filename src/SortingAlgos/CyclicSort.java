package SortingAlgos;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        // NOTE ; when the array is in 1-N range and asked to sort use cyclic sort
        int[] arr = {3,5,2,1,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicsort(int[] arr){
        int i =0;
        while(i < arr.length){
            int correctIndex = arr[i] -1; // if the range is from 0-N then the correctIndex = arr[i]
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
    }
}
