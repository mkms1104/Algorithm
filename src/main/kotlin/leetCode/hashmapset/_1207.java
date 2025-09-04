package leetCode.hashmapset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _1207 {
    public static void main(String[] args) {
        boolean output = new _1207().uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0});
        System.out.println(output);
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        long originCount = map.size();
        long afterCount = new HashSet<>(map.values()).size();

        return originCount == afterCount;
    }
}
