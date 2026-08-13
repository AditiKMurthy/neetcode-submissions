class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        for(int i=0; i<n; i++) {
            Set<Character> set = new HashSet<>();
            for(int j=0; j<n; j++) {
                if(board[i][j] != '.') {
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
        }

        for(int j=0; j<n; j++) {
            Set<Character> set = new HashSet<>();
            for(int i=0; i<n; i++) {
                if(board[i][j] != '.') {
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
        }

        for(int boardRow=0; boardRow<n; boardRow+=3) {
            for(int boardCol=0; boardCol<n; boardCol+=3) {
                Set<Character> set = new HashSet<>();

                for(int i=0; i<3; i++) {
                    for(int j=0; j<3; j++) {
                        char curr = board[boardRow+i][boardCol+j];
                        if(curr != '.') {
                            if(set.contains(curr)) return false;
                            set.add(curr);
                        }
                    }
                }
            }
        }

        return true;
    }
}
