class Solution {
    boolean capacity(int [] nums,int n,long mid ,int day){
        int days=1;
        long subarray=0;
        for(int i=0;i<n;i++){
            if(subarray+nums[i]<=mid){
                subarray+=nums[i];
            }
            else{
                days++;
                subarray=nums[i];
                if(days>day){
                    return false;
                }
            }
        }
        return true;

    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        long low=0;
        long high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        long res=-1;
        while(low<=high){
            long mid=(low+high)/2;
            if(capacity(weights,n,mid,days)){
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