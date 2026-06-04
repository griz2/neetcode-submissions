class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //rows
        for(int i=0; i<9; i++){
            Set<Character> rowSeen = new HashSet<>();
            for(int j=0; j<9; j++){
                if (board[i][j]!='.'){
                    if(rowSeen.contains(board[i][j])){
                        return false;
                    }
                    rowSeen.add(board[i][j]);
                }
            }
        }

        //cols
        for(int i=0; i<9; i++){
            Set<Character> colSeen = new HashSet<>();
            for(int j=0; j<9; j++){
                if (board[j][i]!='.'){    
                    if(colSeen.contains(board[j][i])){
                        return false;
                    }
                    colSeen.add(board[j][i]);
                } 
            }
        }

        //squares
        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

        return true;

    }
}
