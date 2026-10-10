class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            h.put(curr,h.getOrDefault(curr,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b)-> h.get(b) - h.get(a));
        for(int n:h.keySet()){
            pq.add(n);
        }


        int ans[] = new int[k];
        for(int i=0;i<k;i++){
           ans[i]=pq.remove();
        }

         return ans;
    }
}
