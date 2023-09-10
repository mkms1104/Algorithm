package exam.tmap;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>() {{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};
        int currKey = -1;
        int currValue = -1;

        for (int i=0; i<A.length; i++) {
            if (i % 2 == 0) {
                currKey = A[i];
                currValue = map.get(currKey) + 1;
            } else {
                if (map.get(A[i]) < currValue) {
                    map.put(A[i], currValue);
                }
            }
        }

        return (A.length / 2) - map.values().stream().max(Integer::compareTo).get();
    }
}
