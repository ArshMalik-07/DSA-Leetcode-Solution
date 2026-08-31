class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
           Arrays.sort(arr);
           int ans=0;
           int n=arr.length;
           for(int i=0;i<n-2;i++){
               int left=i+1;
               int right=n-1;
               while(left<right){
               int target=arr[i]+arr[left]+arr[right];
               if(target<sum){
                   ans=ans+(right-left);
                   left++;
                   }
                else{
                    right--;
                }
           }
        }
           return ans;
    }
}