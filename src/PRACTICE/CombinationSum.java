package PRACTICE;

import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            backtrack(result, tempList, candidates, remain - candidates[i], i); // Not i + 1 because we can reuse same elements
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;

        int[] candidates2 = {2, 3, 5};
        int target2 = 8;

        List<List<Integer>> result1 = combinationSum(candidates1, target1);
        List<List<Integer>> result2 = combinationSum(candidates2, target2);


        System.out.println("타겟 " + target1 + "에 대한 조합: " + result1);
        System.out.println("타겟 " + target2 + "에 대한 조합: " + result2);
   }
}

