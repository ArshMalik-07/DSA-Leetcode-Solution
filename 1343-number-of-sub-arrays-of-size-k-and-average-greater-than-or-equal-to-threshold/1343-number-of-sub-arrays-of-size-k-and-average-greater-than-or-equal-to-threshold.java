class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
             sum=sum+arr[i];
        }
        int low=0;
        int high=k-1;
        int count=0;
        while(high<arr.length){
            double avg= (double) sum/k;
            if(avg>=threshold){
                count++;
            }
            if(high+1<arr.length){
                sum=sum-arr[low]+arr[high+1];
            }
            low++;
            high++;
        }
        return count;
    }
}