class Solution {
    public boolean isValidSudoku(char[][] board) {
    
        int[][] dupesListGrid = new int[9][9];
        int gridCount = 1;
        int rowCount = 1;
        int columnCount = 1;

        for (int i = 0; i < board.length; i++) {
            // rows first
            int[] dupesListRow = new int[9];
            int[] dupesListColumn = new int[9];

            for (int j = 0; j < board[i].length; j++){
                char elementRow = board[i][j];
                if (elementRow != '.' && Arrays.stream(dupesListRow).anyMatch(x -> x == (elementRow - '0'))) {
                    return false;
                } else if (elementRow != '.') {
                    dupesListRow[j] = elementRow - '0';
                } else {
                    dupesListRow[j] = 0;
                }

                // row logic over
                // columns in the same loop
                char elementColumn = board[j][i];

                if (elementColumn != '.' && Arrays.stream(dupesListColumn).anyMatch(x -> x == (elementColumn - '0'))) {
                    return false;
                } else if (elementColumn != '.') {
                    dupesListColumn[j] = elementColumn - '0';
                } else {
                        dupesListColumn[j] = 0;
                }

                char elementSub = board[i][j];

                int boxIndex = (i/3) * 3 + (j/3);
                int boxPos = (i%3) * 3 + (j%3);

                if (elementSub != '.' && Arrays.stream(dupesListGrid[boxIndex]).anyMatch(x -> x == (elementSub - '0'))) {
                    return false;
                } else if (elementSub != '.') {
                    dupesListGrid[boxIndex][boxPos] = elementSub - '0';
                } else {
                    dupesListGrid[boxIndex][boxPos] = 0;
                }

            } 
        }
        return true;
    }
}
