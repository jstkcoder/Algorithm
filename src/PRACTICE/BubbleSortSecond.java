package PRACTICE;

public class BubbleSortSecond {
    // 버블 정렬 함수
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // 배열의 모든 요소에 대해 반복
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // 배열의 마지막 i 요소는 이미 정렬되어 있기 때문에 제외하고 반복
            for (int j = 0; j < n - 1 - i; j++) {
                // 인접한 요소를 비교하여 순서가 잘못된 경우 교환
                if (arr[j] > arr[j + 1]) {
                    // arr[j]와 arr[j + 1] 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // 만약 한 번도 교환되지 않았다면 배열은 이미 정렬된 상태
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("정렬 전 배열:");
        printArray(arr);

        bubbleSort(arr);

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
