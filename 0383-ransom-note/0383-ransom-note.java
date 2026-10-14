class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ran=ransomNote.length();
        int mag=magazine.length();
        HashMap<Character,Integer> need=new HashMap<>();
        HashMap<Character,Integer> have=new HashMap<>();
        for(int i=0;i<ran;i++){
            need.put(ransomNote.charAt(i),need.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<mag;i++){
            have.put(magazine.charAt(i),have.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(char ch:need.keySet()){
            if(need.get(ch)>have.getOrDefault(ch,0)){
                return false;
            }
        }
        return true;
    }
}