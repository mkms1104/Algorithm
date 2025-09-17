package leetCode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class _1926 {
    public static void main(String[] args) {
        char[][] maze = {
            {'+', '+', '.', '+'},
            {'.', '.', '.', '+'},
            {'+', '+', '+', '.'}
        };
        int[] entrance = new int[]{1,2};

        int output = new _1926().nearestExit(maze, entrance);
        System.out.println(output);
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+'; // 방문 처리

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0], col = curr[1], step = curr[2];

            for (int[] d : directions) {
                int newRow = row + d[0];
                int newCol = col + d[1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && maze[newRow][newCol] == '.') {
                    // 출구 조건: 경계에 있고 시작점이 아님
                    if (newRow == 0 || newRow == m-1 || newCol == 0 || newCol == n-1) {
                        return step + 1;
                    }
                    maze[newRow][newCol] = '+'; // 방문 처리
                    queue.offer(new int[]{newRow, newCol, step+1});
                }
            }
        }
        return -1;
    }
}
