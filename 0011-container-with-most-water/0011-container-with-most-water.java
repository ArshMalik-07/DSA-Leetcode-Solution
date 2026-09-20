class Solution {
    public int maxArea(int[] height) {
        int res=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int length= Math.min(height[left],height[right]);
            int breadth= right-left;
            int area=length*breadth;
            res=Math.max(res,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}