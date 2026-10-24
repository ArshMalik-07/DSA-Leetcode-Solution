class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid+1]>arr[mid]){
                low=mid+1;
            }
            else if(arr[mid-1]>arr[mid]){
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}