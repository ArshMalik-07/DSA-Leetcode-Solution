class Solution {
    public int findDuplicate(int[] nums) {
         int slow=0;
         int fast=0;
         while(true){
            slow=nums[slow];
            fast=nums[fast];
            fast=nums[fast];
            if(slow==fast){
                break;
            }
         }
         slow=0;
         while(true){
            slow=nums[slow];
            fast=nums[fast];
            if(slow==fast){
                return slow;
            }
         }
    }
}