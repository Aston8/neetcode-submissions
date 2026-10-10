class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> h =  new HashSet<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j< board[0].length;j++){
                char c = board[i][j];

                if(c=='.'){
                    continue;
                }

                String row= c+" row "+i;
                String col= c+" col "+j;

                String box = c+" box "+(i/3)+"-"+(j/3);

                System.out.println(h);

                if(h.contains(row)  || h.contains(col) ||  h.contains(box)){
                    return false;
                }

                h.add(row);
                h.add(col);
                h.add(box);
            }
        }

        return true;
        
    }
}
