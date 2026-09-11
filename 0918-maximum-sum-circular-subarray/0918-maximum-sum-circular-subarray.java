class Solution {
    int arr [];
    int maxsum(){
        int bestending=arr[0];
        int ans1=arr[0];
        for(int i=1;i<arr.length;i++){
            bestending=Math.max(bestending+arr[i],arr[i]);
            ans1=Math.max(ans1,bestending);
        }
        return ans1;
    }
    int minsum(){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int bestending=arr[0];
        int ans2=arr[0];
        for(int i=1;i<arr.length;i++){
            bestending=Math.min(bestending+arr[i],arr[i]);
            ans2=Math.min(ans2,bestending);
        }
        sum=sum-ans2;
        return sum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        this.arr=nums;
        int max=maxsum();
        if(max<0){
            return max;
        }
        int min=minsum();
        return Math.max(max,min);
    }
}