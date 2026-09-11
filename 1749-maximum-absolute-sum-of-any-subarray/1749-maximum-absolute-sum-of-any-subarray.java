class Solution {
    int arr[];
    int maxsum(){
        int bestending=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            bestending=Math.max(bestending+arr[i],arr[i]);
            ans=Math.max(ans,bestending);
        }
        return ans;
    }
    int minsum(){
        int bestending=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            bestending=Math.min(bestending+arr[i],arr[i]);
            ans=Math.min(ans,bestending);
        }
        return ans;
    }
    public int maxAbsoluteSum(int[] nums) {
        this.arr=nums;
        int max=maxsum();
        int min=minsum();
        return Math.max(Math.abs(max),Math.abs(min));
    }
}