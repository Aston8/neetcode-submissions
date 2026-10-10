class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h =new HashMap<>();
        int ans[]= new int[2];

        for(int i=0;i<nums.length;i++){
            int curr = target-nums[i];
            if(h.containsKey(curr)){
                ans[0]= h.get(curr);
                ans[1] = i;
                return ans;
            }

            h.put(nums[i],i);
        }

        return ans;
    }
}
