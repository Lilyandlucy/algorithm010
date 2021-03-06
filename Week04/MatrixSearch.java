package Week04;

/**
 * 74. 搜索二维矩阵
 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：

 每行中的整数从左到右按升序排列。
 每行的第一个整数大于前一行的最后一个整数。
 */
public class MatrixSearch {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;

        int left = 0, right = m * n - 1;
        while (left <= right) {
            int index = (left + right) / 2;
            int row = index / n;
            int column = index % n;
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] < target) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }

        return false;
    }

}
