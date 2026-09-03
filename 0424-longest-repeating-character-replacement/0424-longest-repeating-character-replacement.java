class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq=new int[255] ;
        int low=0;
        int maxfreq=0;
        int res=0;
        for(int high=0;high<s.length();high++){
            freq[s.charAt(high)]++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(high)]);
            int len=high-low+1;
            int diff=len-maxfreq;
            while(diff>k){
                  freq[s.charAt(low)]--;
                low++;
                len=high-low+1;
                diff=len-maxfreq;
            }
            res=Math.max(res,len);
        }
        return res;
    }
}