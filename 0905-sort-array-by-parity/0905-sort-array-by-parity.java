class Solution {
    public void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=0;
        while(right<nums.length){
            if(nums[right]%2==0){
                swap(nums,left,right);
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        return nums;
    }
}