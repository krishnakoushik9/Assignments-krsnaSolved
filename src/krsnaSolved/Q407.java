package krsnaSolved;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Q407 {

    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length < 3 || heightMap[0].length < 3) {
            return 0;
        }

        int n = heightMap.length;
        int m = heightMap[0].length;
        int ans = 0;

        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.height));
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            visited[i][0] = true;
            pq.add(new Cell(heightMap[i][0], i, 0));
            visited[i][m - 1] = true;
            pq.add(new Cell(heightMap[i][m - 1], i, m - 1));
        }
        for (int j = 0; j < m; j++) {
            visited[0][j] = true;
            pq.add(new Cell(heightMap[0][j], 0, j));
            visited[n - 1][j] = true;
            pq.add(new Cell(heightMap[n - 1][j], n - 1, j));
        }

        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!pq.isEmpty()) {
            Cell cell = pq.remove();

            for (int i = 0; i < 4; i++) {
                int x = cell.row + dir[i][0];
                int y = cell.col + dir[i][1];

                if (x >= 0 && x < n && y >= 0 && y < m && !visited[x][y]) {
                    visited[x][y] = true;
                    ans += Math.max(0, cell.height - heightMap[x][y]);
                    pq.add(new Cell(Math.max(heightMap[x][y], cell.height), x, y));
                }
            }
        }
        return ans;
    }
}

class Cell {
    int height;
    int row;
    int col;

    Cell(int height, int row, int col) {
        this.height = height;
        this.row = row;
        this.col = col;
    }
}
