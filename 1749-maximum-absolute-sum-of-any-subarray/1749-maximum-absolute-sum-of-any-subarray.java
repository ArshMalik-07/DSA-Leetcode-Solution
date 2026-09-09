class Solution {
      int nums[];
    int maxsum(){
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
    int minsum(){
        int bestending=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int a=bestending+nums[i];
            int b=nums[i];
            int best=Math.min(a,b);
            bestending=best;
            ans=Math.min(ans,best);
        }
        return ans;
    }
    public int maxAbsoluteSum(int[] nums) {
        this.nums=nums;
        int max=maxsum();
        int min=minsum();
        return Math.max(Math.abs(max),Math.abs(min));
    }
}