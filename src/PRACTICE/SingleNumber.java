package PRACTICE;

public class SingleNumber {

    // 세 번 나타나는 모든 요소를 제외하고 한 번 나타나는 요소를 찾는 메서드
    public static int singleNumber(int[] nums) {
        int seenOnce = 0; // 한 번 나타난 요소를 저장하는 변수
        int seenTwice = 0; // 두 번 나타난 요소를 저장하는 변수

        for (int num : nums) {
            // 한 번 나타난 요소와 두 번 나타난 요소를 업데이트
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
            System.out.println(seenOnce);
            System.out.println(seenTwice);
        }

        return seenOnce; // 한 번 나타나는 요소 반환
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 3, 2};
        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};

        // 세 번 나타나는 모든 요소를 제외하고 한 번 나타나는 요소를 찾아 출력
        System.out.println("nums1에서 한 번 나타나는 요소: " + singleNumber(nums1));
        System.out.println("nums2에서 한 번 나타나는 요소: " + singleNumber(nums2));
    }
}
