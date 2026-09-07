class Solution {
    public int happy(int m){
            int sum=0;
            while(m>0){
            int d= m%10;
                m=m/10;
            sum=sum+(d*d);
            }
            return sum;
        }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(true){
            slow=happy(slow);
            fast=happy(happy(fast));
           if(fast==1){
            return true;
           }
           if(slow==fast){
            return false;
           }
        }
    }
}