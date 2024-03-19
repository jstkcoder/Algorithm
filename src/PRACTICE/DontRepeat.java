package PRACTICE;

public class DontRepeat {
    /* 단일 요소를 찾기 위해서 ^=(xor) 연산자를 이용해 구할 수 있음
    * ex => 4(0100)와 1(0001) 의 xor = 5(0101)
    * 결국 남는 비트의 값이 중복되지 않은 값이므로 단일 요소를 찾기 위해서 이렇게 구할 수 있음
    */
    static int notRepeat(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int[] nums2 = {5,1,1,4,4};
//        System.out.println("중복되지 않는 수 : " + notRepeat(nums));
        System.out.println("중복되지 않는 수 : " + notRepeat(nums2));
    }
}
