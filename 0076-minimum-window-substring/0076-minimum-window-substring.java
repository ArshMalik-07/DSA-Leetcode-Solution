class Solution {
    public boolean isValid(int [] freqs,int [] freqt){
        for(int i=0;i<255;i++){
            if(freqs[i]<freqt[i]){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int [] freqs=new int[255];
        int [] freqt=new int[255];
        for(int high=0;high<t.length();high++){
            freqt[t.charAt(high)]++;
        }
        int low=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;
        for(int high=0;high<s.length();high++){
            freqs[s.charAt(high)]++;
            while(isValid(freqs,freqt)){
                int len=high-low+1;
                if(len<minLen){
                    minLen=len;
                    start=low;
                }
                freqs[s.charAt(low)]--;
                low++;
            }
        }
         if(minLen==Integer.MAX_VALUE){
                return "";
            }
        return s.substring(start,start + minLen);
        
    }
}