class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int k = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = k;
            }
        }
        for (int i = 0; i < n; i++) {
            int[] tA = matrix[i];
            reverse(tA);
        }

    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
            i++;
            j--;
        }
    }
}