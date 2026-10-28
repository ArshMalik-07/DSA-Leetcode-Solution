class Solution {
    long hourFind(int[] piles,int k){
        long hour=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            hour+=piles[i]/k;
            if(piles[i]%k!=0){
                hour++;
            }
        }
        return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,piles[i]);
        }
        int low=1;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            long hourNeeded=hourFind(piles,mid);
            if(hourNeeded>h){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
}