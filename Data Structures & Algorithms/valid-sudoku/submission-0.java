class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int row = 0; row<9; ++row) {
            HashSet<Character> seenRows = new HashSet<>();
            for (int i = 0 ; i<9 ; ++i) {
                if (board[row][i]=='.'){
                    continue;
                }
                if (seenRows.contains(board[row][i])){
                    return false;
                }
                seenRows.add(board[row][i]);
            }
        }

        for (int col = 0; col<9; ++col) {
            HashSet<Character> seenCols = new HashSet<>();
            for (int i = 0; i<9; ++i ){
                if (board[i][col]=='.'){
                    continue;
                }
                if (seenCols.contains(board[i][col])){
                    return false;
                }
                seenCols.add(board[i][col]);
            }
        }

        for (int sq = 0; sq<9; ++sq){
            HashSet<Character> seenSq = new HashSet<>();
            for (int i = 0; i<3 ; ++i){
                for (int j = 0; j<3; ++j){
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;
                if (board[row][col]=='.'){
                    continue;
                }
                if (seenSq.contains(board[row][col])){
                    return false;
                }
                seenSq.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
