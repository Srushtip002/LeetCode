class Solution {

    public boolean exist(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == word.charAt(0) &&
                        find(i, j, 0, word, board, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean find(int r, int c, int idx,
                               String word,
                               char[][] board,
                               boolean[][] visited) {

        // base case: word fully matched
        if (idx == word.length()) {
            return true;
        }

        // boundary + invalid checks
        if (r < 0 || c < 0 ||
            r >= board.length || c >= board[0].length ||
            visited[r][c] ||
            board[r][c] != word.charAt(idx)) {
            return false;
        }

        // mark visited
        visited[r][c] = true;

        // explore all 4 directions
        boolean found =
                find(r + 1, c, idx + 1, word, board, visited) ||
                find(r - 1, c, idx + 1, word, board, visited) ||
                find(r, c + 1, idx + 1, word, board, visited) ||
                find(r, c - 1, idx + 1, word, board, visited);

        // backtrack
        visited[r][c] = false;

        return found;
    }
}