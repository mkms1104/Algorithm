package leetCode.hashmapset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _2215 {
    public static void main(String[] args) {
        List<List<Integer>> output = new _2215().findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2});
        System.out.println(output);
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> numsSet1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> numsSet2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<List<Integer>> output = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        for(int num : numsSet1){
            if(!numsSet2.contains(num)){
                list1.add(num);
            }
        }
        output.add(list1);

        List<Integer> list2 = new ArrayList<>();
        for(int num : numsSet2){
            if(!numsSet1.contains(num)){
                list2.add(num);
            }
        }
        output.add(list2);

        return output;
    }
}
