class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean hasValidRows = validRows(board);
        boolean hasValidColumns = validColumns(board);
        boolean hasValidGrid = validGrid(board);
        return hasValidRows && hasValidColumns && hasValidGrid;
    }

    private boolean validRows(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> validSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') continue;
                if (validSet.contains(board[row][i])) return false;
                validSet.add(board[row][i]);
            }
        }
        return true;
    }

    private boolean validColumns(char[][] board) {
        for (int col = 0; col < 9; col++) {
            Set<Character> validSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.') continue;
                if (validSet.contains(board[i][col])) return false;
                validSet.add(board[i][col]);
            }
        }
        return true;
    }

    private boolean validGrid(char[][] board) {
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
