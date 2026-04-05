class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int total = rows * columns;

        int sr = 0;
        int sc = 0;
        int er = rows-1;
        int ec = columns-1;

        List<Integer> res = new LinkedList<Integer>();
        int count = 0;
        while(count != total){
            for(int c = sc; c <= ec && count < total; c++){
                res.add(matrix[sr][c]);
                count++;
            }
            sr++;
            for(int r = sr;r<=er && count < total;r++){
                res.add(matrix[r][ec]);
            count++;
            }
            ec--;
            for(int c  = ec;c>=sc  && count < total;c--){
                res.add(matrix[er][c]);
            count++;
            }
            er--;
            for(int r = er;r>=sr && count < total;r--){
                res.add(matrix[r][sc]);
            count++;
            }
            sc++;
        }
        return res;
    }
}