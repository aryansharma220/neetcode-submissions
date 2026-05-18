class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            String sorted = sort(str);
            if(map.containsKey(sorted)) map.get(sorted).add(str);
            else{
                map.put(sorted, new ArrayList<>());
                map.get(sorted).add(str);
            }
        }
        for(List<String> lst:map.values()) res.add(lst);
        return res;
    }

    public String sort(String str){
        int[] store = new int[26];
        for(char ch:str.toCharArray()){
            store[ch-'a']++;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<26;i++){
            int j=store[i];
            while(j>0){
                res.append((char)('a'+i));
                j--;
            }
        }
        return res.toString();
    }
        // for(int i=0;i<strs.length;i++){
        //     String str=strs[i];
        //     if(!str.equals("-1")){
        //         List<String> store = new ArrayList<>();
        //         store.add(str);
        //         for(int j=i+1;j<strs.length;j++){
        //             if(!strs[j].equals("-1") && isAnagram(str,strs[j])){
        //                 store.add(strs[j]);
        //                 strs[j]="-1";
        //             }
        //         }
        //         res.add(store);
        //     }
        // }

    // public boolean isAnagram(String str1, String str2){
    //     if(str1.length()!=str2.length()) return false;
    //     int[] arr = new int[26];
    //     for(int i=0;i<str1.length();i++){
    //         arr[str1.charAt(i)-'a']++;
    //         arr[str2.charAt(i)-'a']--;
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]!=0) return false;
    //     }
    //     return true;
    // }

}
