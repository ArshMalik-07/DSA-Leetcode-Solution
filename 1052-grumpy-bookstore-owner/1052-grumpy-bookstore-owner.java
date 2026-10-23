class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int satisfied=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        int sum=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum=sum+customers[i];
            }
        }
        int maxsum=sum;
        for(int right=minutes;right<n;right++){
            int left=right-minutes;
            if(grumpy[left]==1){
                sum-=customers[left];
            }
            if(grumpy[right]==1){
                sum+=customers[right];
            }
            maxsum=Math.max(maxsum,sum);
        }
        return satisfied+maxsum;
    }
}