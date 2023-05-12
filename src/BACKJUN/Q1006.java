package BACKJUN;

import java.util.Scanner;

public class Q1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        int[][] dp = new int[n+1][k+1];
        int[] sum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            sum[i] = sum[i-1] + arr[i];
            dp[i][1] = sum[i];
        }
        for (int i = 2; i <= k; i++) {
            for (int j = i; j <= n; j++) {
                for (int l = i-1; l < j; l++) {
                    dp[j][i] = Math.max(dp[j][i], dp[l][i-1] * (sum[j]-sum[l]));
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
