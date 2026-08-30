class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {

            if (rows[i]) {
                int j = 0;
                while (j < col) {
                    matrix[i][j] = 0;
                    j++;
                }
            }
        }

        for (int j = 0; j < col; j++) {

            if (cols[j]) {
                int i = 0;
                while (i < row) {
                    matrix[i][j] = 0;
                    i++;
                }
            }
        }
    }
}