package PRACTICE;

public class OneDataPlus {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};

        int[] result1 = plusOne(digits1);
        int[] result2 = plusOne(digits2);

        System.out.print("Incremented digits1: ");
        for (int digit : result1) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.print("Incremented digits2: ");
        for (int digit : result2) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}

