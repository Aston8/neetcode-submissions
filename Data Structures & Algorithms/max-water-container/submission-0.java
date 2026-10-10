class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j = heights.length-1;
        int max = Integer.MIN_VALUE;

        while(i<j){
            int min = Math.min( heights[i], heights[j]);
            int curr = min * (j-i);

            max = Math.max(max,curr);

            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }

        }

        return max;
    }
}
