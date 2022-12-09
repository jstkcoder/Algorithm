package PRACTICE;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassEx {
    /*
     * 	Vector, ArrayList 클래스는
     * 모두 '동적' 배열(즉 가변 배열)클래스 이다.
     * 고정 배열이 가지고 있는 문제점을 해결하기 위해서 만들어진 클래스들이다.
     *
     * <차이점>
     * Vector는 동기화가 보장되지만, ArrayList는 동기화가 되지 않는다.
     *
     */
    public static void main(String[] args) {
        // ArrayList 객체 생성
        // List
        List<Integer> list = new ArrayList<Integer>();

        /* 객체 추가 */
        list.add(new Integer(90)); // 정수 90을 객체화 시킴 ! list.add(90); 가능
        list.add(new Integer(85));
        list.add(new Integer(100));
        list.add(new Integer(70));
        list.add(new Integer(75));

        System.out.println(list);
        // [90, 85, 100, 70, 75]

        list.add(2,60);
        System.out.println(list);
        // [90, 85, 60, 100, 70, 75]

        /* 객체 변경 */
        list.set(1, 70);
        System.out.println(list);
        // [90, 70, 60, 100, 70, 75]

        /* 객체 삭제 */
        list.remove(3);
        System.out.println(list);
        // [90, 70, 60, 70, 75]

    }
}
