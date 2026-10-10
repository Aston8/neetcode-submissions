class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m  = t.length();
        if(n != m){
            return false;
        }

        int fre1[] = new int[26];
        int fre2[] = new int[26];

        for(int i =0;i<n;i++){
            int curr = s.charAt(i);
            fre1[curr -'a']++;
        }

         for(int i =0;i<m;i++){
            int curr = t.charAt(i);
            fre2[curr -'a']++;
        }

        for(int i =0;i<26;i++){
            if(fre1[i] != fre2[i]){
                return false;
            }
        }

        return true;

    }
}
