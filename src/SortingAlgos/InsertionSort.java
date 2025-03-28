package SortingAlgos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,9,1,0,-2,3};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionsort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
