class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            if(!str.equals("-1")){
                List<String> store = new ArrayList<>();
                store.add(str);
                for(int j=i+1;j<strs.length;j++){
                    if(!strs[j].equals("-1") && isAnagram(str,strs[j])){
                        store.add(strs[j]);
                        strs[j]="-1";
                    }
                }
                res.add(store);
            }
        }
        return res;
    }

    public boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()) return false;
        int[] arr = new int[26];
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)-'a']++;
            arr[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}
