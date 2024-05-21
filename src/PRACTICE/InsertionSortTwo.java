package PRACTICE;

public class InsertionSortTwo {
    // 삽입 정렬 함수
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // 배열의 두 번째 요소부터 시작
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // 현재 요소를 정렬된 부분 배열에 삽입할 위치를 찾음
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("정렬 전 배열:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("정렬 후 배열:");
        printArray(arr);
    }

    // 배열을 출력하는 함수
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
