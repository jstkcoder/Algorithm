package BACKJUN;

import java.util.Scanner;

   /* 은기는 음이 아닌 정수 n개로 이루어진 수열을 이용해 시간을 때우고 있다. 은기는 수열을 총 k+1개로 나누어야 하고, 각 부분은 비어있지 않아야 한다. 수열을 k+1개로 나누러면, 아래와 같은 과정을 k번 반복해야 한다.

    원소를 두 개 이상 가지고 있는 부분을 고른다. (가장 처음에는 수열 전체밖에 없다)
    임의의 두 원소 사이를 기준으로 수열을 두 부분으로 나눈다.
    위의 과정을 할 때마다 얻게되는 점수는 새로 나누어진 각 부분에 들어있는 원소의 합을 곱한 것이다. 위의 과정을 k번 반복하면서 은기가 얻을 수 있는 점수의 최댓값을 구하는 자바 프로그램을 작성하시오.
    */
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
