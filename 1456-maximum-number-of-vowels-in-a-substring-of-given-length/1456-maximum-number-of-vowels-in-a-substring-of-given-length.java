class Solution {
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public int maxVowels(String s, int k) {
        int low=0;
        int high=k-1;
        int ans=0;
        int vowel=0;
        for(int i=low;i<=high;i++){
            if(isVowel(s.charAt(i))){
                vowel++;
            }
        }
        ans=vowel;
        while(high+1<s.length()){
            low++;
            high++;
            if(isVowel(s.charAt(high))){
                vowel++;
            }
            if(isVowel(s.charAt(low-1))){
                vowel--;
            }
            ans=Math.max(ans,vowel);
        }
        return ans;
    }
}