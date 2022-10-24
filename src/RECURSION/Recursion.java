package RECURSION;

import java.util.ArrayList;

public class Recursion {
//재귀 함수이란 컴퓨터가 수행할 작업 중 반복되는 것을 작업 단위로 쪼개어 한 작업을 실행 후
// 나머지 작업을 자기 자신에게 호출하는 하여 결과를 완성하는 것을 말합니다. 주로 완전탐색에서 자주 사용되는 방법입니다.

    // 단순한 중첩 문제 풀이
//   private static void result2( String[] people ) {
//        int count = 0;
//        for( int firstIndex = 0; firstIndex < people.length; firstIndex++ ) {
//            for( int secondIndex = 0; secondIndex < people.length; secondIndex++ ) {
//
//                if( firstIndex == secondIndex ) continue;
//
//                for( int thirdIndex = 0; thirdIndex < people.length; thirdIndex++ ) {
//                    if( thirdIndex == secondIndex || thirdIndex == firstIndex ) continue;
//
//                    String first = people[firstIndex];
//                    String second= people[secondIndex];
//                    String third = people[thirdIndex];
//                    count++;
//                    System.out.println("( "+first +" " + second + " " + third +" )");
//                }
//            }
//        }
//        System.out.println("총 경우의 수 : " + count);
//    }
    // 재귀 문제 풀이
    private static void result( String[] people ) {
        int r = 3;
        boolean[] isChecked = new boolean[people.length];
        String[] result = new String[r];
        ArrayList<String[]> totalList = new ArrayList<String[]>();

        permutation(people, isChecked, result, r, 0, totalList);

        for (String[] strings : totalList) {
            String temp = "";
            for( String text : strings ) {
                temp += " " + text;
            }
            System.out.println(temp);
        }
        System.out.println("총 경우의 수 : " + totalList.size());
    }

    private static void permutation( String[] people, boolean[] isChecked, String[] result, int endPoint, int dept, ArrayList<String[]> totalList ) {
        if( endPoint == dept ) {
            totalList.add(result.clone());
        } else {
            for ( int i = 0; i < people.length; i++ ) {
                if( !isChecked[i] ) {
                    isChecked[i] = true; // 사용된 배열 위치
                    result[dept] = people[i]; // 저장
                    permutation(people, isChecked, result, endPoint, dept + 1, totalList);
                    isChecked[i] = false; // 사용된 것 다시 제자리
                    result[dept] = ""; // 저장된 것 제자리
                }
            }
        }
    }
}
