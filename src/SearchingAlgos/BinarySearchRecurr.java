package SearchingAlgos;

public class BinarySearchRecurr {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,12,45,78};
        int target = 6;
        System.out.println(binarySearchrecurr(arr,target,0,arr.length));
    }
    // binary search using the recursion methodology
    public static int binarySearchrecurr(int[] arr,int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid] == target){ // if the arr[mid] is the target then the mid index is returned to the above recursive calls
            return mid;
        }else if(arr[mid] < target){ // if the arr[mid] is less than the target then possibly the target might contain in the right half so updating the start with mid+1
            return binarySearchrecurr(arr,target,mid+1,end);
        }else{// if the arr[mid] is greater than the target then it might possible that the target might be present in the left half o updating hte end with mid-1
            return binarySearchrecurr(arr,target,start,mid-1);
        }
    }
}
