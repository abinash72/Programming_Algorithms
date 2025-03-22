package SearchingAlgos;

public class LinearSearchRecurr {
    public static void main(String[] args) {
        int[] arr ={2,4,6,1,7,8};
        int target = 1;
        System.out.println(linearsearchrecurr(arr,target,0));
    }
    // Linear search using the recursion methodology
    public static int linearsearchrecurr(int[] arr, int target,int pointingIndex){
        if(pointingIndex == arr.length){
            return -1;
        }

        if(arr[pointingIndex] == target){
            return pointingIndex;
        }

        return linearsearchrecurr(arr,target,pointingIndex+1);
    }
}
