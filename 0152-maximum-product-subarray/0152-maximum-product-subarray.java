class Solution {
    public int maxProduct(int[] nums) {
        int maxending=nums[0];
        int minending=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int a=nums[i];
            int b=maxending*nums[i];
            int c=minending*nums[i];
            maxending=Math.max(a,Math.max(b,c));
            minending=Math.min(a,Math.min(b,c));
            ans=Math.max(ans,Math.max(maxending,minending));
        }
        return ans;
    }
}