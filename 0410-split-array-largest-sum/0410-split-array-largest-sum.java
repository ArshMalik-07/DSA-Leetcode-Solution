class Solution {
    boolean find(int [] nums,int n,long mid,int num){
        int k=1;
        long subarray=0;
        for(int i=0;i<n;i++){
            if(subarray+nums[i]<=mid){
                subarray=subarray+nums[i];
            }
            else{
                k++;
                subarray=nums[i];
                if(k>num){
                    return false;
                }
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        long low=0;
        long high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        long res=-1;
        while(low<=high){
            long mid=(low+high)/2;
            if(find(nums,n,mid,k)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)res;
    }
}