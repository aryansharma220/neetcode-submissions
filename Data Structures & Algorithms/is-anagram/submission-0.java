class Solution {
    public boolean isAnagram(String s, String t) {
        int[] store = new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            store[s.charAt(i)-'a']++;
            store[t.charAt(i)-'a']--;
        }
        for(int num:store){
            if(num!=0) return false;
        }
        return true;
    }
}
