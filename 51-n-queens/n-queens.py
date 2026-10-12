class Solution(object):
    def solveNQueens(self, n):
        solutions = []
        board = [['.' for _ in range(n)] for _ in range(n)]

        def isSafe(row, col):
            # Check the same column above
            for r in range(row):
                if board[r][col] == 'Q':
                    return False

            # Check upper-left diagonal
            r, c = row - 1, col - 1
            while r >= 0 and c >= 0:
                if board[r][c] == 'Q':
                    return False
                r -= 1
                c -= 1

            # Check upper-right diagonal
            r, c = row - 1, col + 1
            while r >= 0 and c < n:
                if board[r][c] == 'Q':
                    return False
                r -= 1
                c += 1

            return True

        def solve(row):
            # All queens have been placed
            if row == n:
                solutions.append(
                    [''.join(r) for r in board]
                )
                return

            # Try every column in the current row
            for col in range(n):
                if isSafe(row, col):
                    board[row][col] = 'Q'

                    solve(row + 1)

                    # Backtrack
                    board[row][col] = '.'

        solve(0)
        return solutions