class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> h = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char curr[] = strs[i].toCharArray();
            Arrays.sort(curr);
            String key = new String(curr);

            if(!h.containsKey(key)){
                h.put(key,new ArrayList<>());
            }

            h.get(key).add(strs[i]);

             
        }

         List<List<String>> ans =  new ArrayList<>();

         for(String k:h.keySet()){
            ans.add(h.get(k));
         }

         return ans;
    }
}
