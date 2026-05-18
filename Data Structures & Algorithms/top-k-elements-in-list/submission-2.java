class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums)map.put(num, map.getOrDefault(num,0)+1);
        while(k-->0){
            int max = Integer.MIN_VALUE;
            for(int val:map.values()) max = Math.max(max,val);
            for(int key:map.keySet()){
                if(map.get(key)==max){
                    res[k]=key;
                    map.remove(key);
                    break;
                }
            }
        }
        return res;
    }
}
