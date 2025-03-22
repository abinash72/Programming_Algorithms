package SortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,9,1,0,-2,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[]  arr){
        for(int i=0; i< arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    public static int getMaxIndex(int[] arr, int start, int last){
        int maxindex =start;
        for(int i=start; i<=last; i++){
            if(arr[i] > arr[maxindex]){
                maxindex = i;
            }
        }

        return maxindex;
    }
}
