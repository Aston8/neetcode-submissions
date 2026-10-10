class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(Character.isLetter(curr)){
                str.append(Character.toLowerCase(curr));
            }else if(Character.isDigit(curr)){
                str.append(curr);
            }
        }

        return isPallindrome(str.toString());
    }

    public static boolean isPallindrome(String str){
        int i=0;
        int j= str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
