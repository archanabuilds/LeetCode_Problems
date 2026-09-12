class NumMatrix {
    private int[][] rowp;
    private int[][] colp;

    int row;
    int col;

    public NumMatrix(int[][] matrix) {
        row = matrix.length;
        col = matrix[0].length;

        rowp = new int[row][col];
        colp = new int[row][col];

        // Row prefix sum
        for (int i = 0; i < row; i++) {
            rowp[i][0] = matrix[i][0];

            for (int j = 1; j < col; j++) {
                rowp[i][j] = rowp[i][j - 1] + matrix[i][j];
            }
        }

        // Column prefix sum
        for (int j = 0; j < col; j++) {
            colp[0][j] = matrix[0][j];

            for (int i = 1; i < row; i++) {
                colp[i][j] = colp[i - 1][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        int sum = 0;

        // row prefix sums
        for (int i = row1; i <= row2; i++) {

            if (col1 == 0) {
                sum += rowp[i][col2];
            } else {
                sum += rowp[i][col2] - rowp[i][col1 - 1];
            }
        }

        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */