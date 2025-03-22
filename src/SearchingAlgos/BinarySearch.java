package SearchingAlgos;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,12,45,78};
        int target = 6;
        System.out.println(binarysearch(arr,target));
    }
    // implementing binary search using the iteration methodology
    public static int binarysearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}
