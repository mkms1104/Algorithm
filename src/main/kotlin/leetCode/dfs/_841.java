package leetCode.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _841 {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(Arrays.asList(1, 3));       // [1, 3]
        graph.add(Arrays.asList(3, 0, 1));    // [3, 0, 1]
        graph.add(Arrays.asList(2));          // [2]
        graph.add(Arrays.asList(0));          // [0]

        boolean output = new _841().canVisitAllRooms(graph);
        System.out.println(output);
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];
        dfs(rooms, 0, visited);

        for (int v : visited) {
            if (v == 0) return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms, int roomIndex, int[] visited) {
        if(visited[roomIndex] == 1) return;
        visited[roomIndex] = 1;

        for(int key : rooms.get(roomIndex)) {
            dfs(rooms, key, visited);
        }
    }
}
