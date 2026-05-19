class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String str:strs){
            res.append(str);
            res.append("Sanu123");
        }
        System.out.println(res.toString());
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        StringBuilder store = new StringBuilder();
        for(char ch:str.toCharArray()){
            store.append(ch);
            if(store.indexOf("Sanu123")!=-1){
                store.delete(store.length()-7, store.length());
                lst.add(store.toString());
                store = new StringBuilder();
            }
        }
        return lst;
    }
}
