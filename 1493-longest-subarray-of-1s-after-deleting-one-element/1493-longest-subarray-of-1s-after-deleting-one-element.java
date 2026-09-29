class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int right=0;
        int zeroCount=0;
        int ans=0;
        while(right<nums.length){
            if(nums[right]==0){
                zeroCount++;
            }
            while(zeroCount>1){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            int count=right-left;
            ans=Math.max(ans,count);
            right++;
        }
        return ans;
    }
}