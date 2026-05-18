class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums) map.put(num, map.getOrDefault(num,0)+1);
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i=0;i<buckets.length;i++) buckets[i] = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            buckets[e.getValue()].add(e.getKey());
        }
        int[] res = new int[k];
        int j=buckets.length-1;
        while(j>=0){
            while(!buckets[j].isEmpty()) {
                res[--k]=buckets[j].remove(buckets[j].size()-1);
                if(k==0) return res;
            }
            j--;
        }
        return res;
        // PriorityQueue<Integer> pq = new PriorityQueue<>(
        //     (a,b)-> map.get(a) - map.get(b)
        // );
        // for(int key: map.keySet()){
        //     pq.offer(key);
        //     if(pq.size()>k) pq.poll();
        // }
        // int[] res = new int[k];
        // while(!pq.isEmpty()){
        //     res[--k] = pq.poll();
        // }

    }
}
