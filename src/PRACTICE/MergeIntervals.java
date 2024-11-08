package PRACTICE;


import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        // 간격을 시작점을 기준으로 정렬합니다.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // merged 리스트가 비어있거나, 현재 간격이 이전 간격과 겹치지 않는 경우
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // 겹치는 경우, 이전 간격의 끝을 현재 간격의 끝과 병합합니다.
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // 리스트를 배열로 변환하여 반환합니다.
        return merged.toArray(new int[merged.size()][]);
    }

    // 테스트 코드
    public static void main(String[] args) {
        MergeIntervals solution = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = solution.merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
