class Solution {
    boolean isPossible(int [] position,int m,int dist){
        int n=position.length;
        int force=1;
        int lastPosition=position[0];
        for(int i=1;i<n;i++){
            if(position[i]-lastPosition>=dist){
                lastPosition=position[i];
                force++;
            }
            if(force>=m){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n= position.length;
        int low=1;
        int high=position[n-1]-position[0];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(position,m,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}