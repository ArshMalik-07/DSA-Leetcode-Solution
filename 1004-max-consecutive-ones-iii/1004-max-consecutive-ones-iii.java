class Solution {
    public int longestOnes(int[] nums, int k) {
        int [] freq=new int[2];
        int low=0;
        int res=0;
        for(int high=0;high<nums.length;high++){
            freq[nums[high]]++;
            int len=high-low+1;
            int diff=freq[0];
            while(diff>k){
                freq[nums[low]]--;
                low++;
                len=high-low+1;
                diff=freq[0];
            }
            res=Math.max(res,len);
        }
        return res;
    }
}