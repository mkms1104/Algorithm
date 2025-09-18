package leetCode.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class _994 {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2},
//                {1, 1, 0},
//                {0, 1, 1}
        };

        int output = new _994().orangesRotting(grid);
        System.out.println(output);
    }

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        // 초기에 Rotting 오렌지 1개가 어느 위치에 있는지는 알 수 없으므로 전체 순회
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[]{i, j, 0});
                }
            }
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int minute = 0;

        while(!queue.isEmpty()) {
            int[] position = queue.poll();
            int row = position[0], col = position[1], currentMinute = position[2];
            int value = grid[row][col];

            minute =  currentMinute;

            // if Rotting 오렌지 (어차피 Rotting 오렌지만 큐에 적재되므로 없어도 됨)
            if(value == 2) {
                for(int[] d : directions) {
                    int newRow = row + d[0];
                    int newCol = col + d[1];
                    if(newRow >= 0 && newCol >= 0 && newRow < grid.length && newCol < grid[0].length) {
                        if(grid[newRow][newCol] == 1) {
                            grid[newRow][newCol] = 2;
                            queue.add(new int[]{newRow, newCol, currentMinute + 1});
                        }
                    }
                }
            }
        }

        // fresh 오렌지가 남아있는지 확인
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) return -1;
            }
        }

        return minute;
    }
}
