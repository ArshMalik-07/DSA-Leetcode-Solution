class Solution {
    public int maxSubArray(int[] nums) {
         int bestending=nums[0];
         int ans=nums[0];
         for(int i=1;i<nums.length;i++){
            int a=bestending+nums[i];
            int b=nums[i];
            int best=Math.max(a,b);
            bestending=best;
            ans=Math.max(ans,best);
         }
         return ans;
    }
}