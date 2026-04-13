record Point(int x, int y) {
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int originalColor = image[sr][sc];
        if(color == originalColor ) return image;
        image[sr][sc] = color;
        Queue<Point> points = new ArrayDeque<>();
        points.add(new Point(sr, sc));

        while (!points.isEmpty()) {
            Point top = points.poll();
            // Up, Down, Left, Right
            int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

            for (int[] dir : directions) {
                int nextX = top.x() + dir[0];
                int nextY = top.y() + dir[1];

                // 1. Checking boundaries
                if (nextX >= 0 && nextX < image.length &&
                        nextY >= 0 && nextY < image[0].length) {

                    // 2. Check if the pixel has same color as original
                    if (image[nextX][nextY] == originalColor) {

                        // 3. Update color and add to queue
                        image[nextX][nextY] = color;
                        points.add(new Point(nextX, nextY));
                    }
                }
            }
           
        }

        return image;
    }
}