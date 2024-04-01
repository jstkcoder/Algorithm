package PRACTICE;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        // 첫 번째 행은 1 하나만 있는 행으로 시작
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // 각 행의 첫 번째 요소는 항상 1
            row.add(1);

            // 첫 번째 요소와 마지막 요소 사이의 요소들을 계산
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // 각 행의 마지막 요소는 항상 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> pascalTriangle = generate(numRows);
        System.out.println(numRows + "개의 행을 갖는 파스칼의 삼각형:");
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}
