class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int res=0;
        boolean odd= false;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            if(freq%2==0){
                res=res+freq;
            }
            else{
                odd=true;
                res=res+(freq-1);
            }
        }
        if(odd==true){
            return res+1;
        }
        else{
            return res;
        }
        
    }
}