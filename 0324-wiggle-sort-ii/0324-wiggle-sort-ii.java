class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] temp=new int[n];
        int mid=(n-1)/2;
        int end=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                temp[i]=nums[mid];
                mid--;
            }
            else{
                temp[i]=nums[end];
                end--;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        } 
        
    }
}