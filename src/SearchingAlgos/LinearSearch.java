package SearchingAlgos;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,4,9,6,8,5,7};
        int target = 4;
        System.out.println(linearSearch(arr,target));
    }
    // Using iteration methodology for the searching linearly
    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
