class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int onedelete=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int oldnodelete=nodelete;
            nodelete=Math.max(nodelete+arr[i],arr[i]);
            onedelete=Math.max(onedelete+arr[i],oldnodelete);
            ans=Math.max(ans,Math.max(nodelete,onedelete));
        }
        return ans;
    }
}