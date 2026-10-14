class Solution {
    public int maxNumberOfBalloons(String text) {
        int m=text.length();
        String s="balloon";
        int n=s.length();
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> have=new HashMap<>();
        for(int i=0;i<m;i++){
            have.put(text.charAt(i),have.getOrDefault(text.charAt(i),0)+1);
        }
        for(int i=0;i<n;i++){
            need.put(s.charAt(i),need.getOrDefault(s.charAt(i),0)+1);
        }
        int ans=Integer.MAX_VALUE;
        for(char ch:need.keySet()){
            int aval=have.getOrDefault(ch,0);
            int req=need.get(ch);
            ans=Math.min(ans,aval/req);
        }
        return ans;
    }
}