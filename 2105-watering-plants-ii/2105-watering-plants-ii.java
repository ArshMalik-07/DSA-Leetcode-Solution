class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int n=plants.length;
        int left=0;
        int right=n-1;
        int refil=0;
        int canA=capacityA;
        int canB=capacityB;
        while(left<right){
            if(plants[left]<=capacityA){
                capacityA-=plants[left];
                left++;
            }
            else{
                capacityA=canA;
                capacityA-=plants[left];
                left++;
                refil++;
            }
            if(plants[right]<=capacityB){
                capacityB-=plants[right];
                right--;
            }
            else{
                capacityB=canB;
                capacityB-=plants[right];
                right--;
                refil++;
            }
        }
        if(left==right && plants[left]>Math.max(capacityA,capacityB)){
            refil++;
        }
        return refil;        
    }
}