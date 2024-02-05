import java.util.Scanner;

public class th12is {

    private static int mintFlow(int[][] tflow, int cur1, int cur2, int wp1, int wp2) {
        int[][] dp = new int[tflow.length][tflow[0].length];

        
        dp[cur1][cur2] = tflow[cur1][cur2];

        
        for (int i = cur1 + 1; i < tflow.length; i++) {
            dp[i][cur2] = dp[i - 1][cur2] + tflow[i][cur2];
        }
        for (int j = cur2 + 1; j < tflow[0].length; j++) {
            dp[cur1][j] = dp[cur1][j - 1] + tflow[cur1][j];
        }

        
        for (int i = cur1 + 1; i <= wp1; i++) {
            for (int j = cur2 + 1; j <= wp2; j++) {
                dp[i][j] = tflow[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        
        return (wp1 >= cur1 && wp2 >= cur2) ? dp[wp1][wp2] : -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        
        int[][] tflow = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tflow[i][j] = scanner.nextInt();
            }
        }

        
        int cur1 = scanner.nextInt() - 1;
        int cur2 = scanner.nextInt() - 1;

        
        int wp1 = scanner.nextInt() - 1;
        int wp2 = scanner.nextInt() - 1;

        
        int output = mintFlow(tflow, cur1, cur2, wp1, wp2);

        System.out.println(output);
    }
}