class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> res= new ArrayList<>();
        int left=0;
        int right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                res.add(nums1[left]);
                left++;
                right++;
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
        }
        int[] ans= new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans; 
    }
}