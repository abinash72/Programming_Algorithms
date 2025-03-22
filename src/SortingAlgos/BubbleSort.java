package SortingAlgos;

import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {4,6,2,9,1,0,-2,3};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[]arr){
        boolean swapped;
        for(int i=0; i<arr.length;i++){
            swapped = false;
            for(int j=0; j<arr.length-i-1 ;j++){
                if(arr[j] > arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}
