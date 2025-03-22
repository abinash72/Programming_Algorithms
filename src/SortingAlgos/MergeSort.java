package SortingAlgos;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7,4,9,2,0,1,3,5,6};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }
    // Merge Sort using RECURSION
    // Here using recursive calls we will first divide the array till the array length is 1 ( single element is present only )
    // The mergesort method will return a sorted new array rather than updating the original one
    public static int[] mergesort(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        // finding the mid everytime until the array length is 1 to split the array into halves
        int mid = arr.length/2;

        int[] firstHalf = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] secondHalf = mergesort((Arrays.copyOfRange(arr,mid,arr.length)));

        //here the firstHalf and secondHalf will be merged
        return mergeSortedArray(firstHalf,secondHalf);
    }

    public static int[] mergeSortedArray(int[] first, int[] second){
        int[] merged = new int[first.length+second.length];

        int i=0, j=0, k=0;
        // 'i' pointer is for the first[] , 'j' pointer is for second[] and 'k' pointer is for merged[]

        while(i < first.length && j< second.length){
            // Will check if the element of first[] is smaller than the element of second[] then the smaller element from first[] will be added to the merged array
            if(first[i] < second[j]){
                merged[k] = first[i];
                i++;
                k++;
            }else{ // here if the element of first[] is greater then second[] element is considered to be smaller and added to the merged array
                merged[k] = second[j];
                j++;
                k++;
            }
        }
        // if there are remaining elements  in the first[] array they will be added to the merged[] array
        while(i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }

        // if there are remaining elements in the second[] array they will be added to the merged[] array
        while(j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }

        //at last the sorted merged array will be returned
        return merged;
    }
}
