class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int low=0;
        int high=k-1;
        double ans=Double.NEGATIVE_INFINITY;
        while(high<nums.length){
            double avg=(double)sum/k;
            ans=Math.max(ans,avg);
            if(high+1<nums.length){
                sum=sum-nums[low]+nums[high+1];
            }
            low++;
            high++;
        }
        return ans;
    }
}