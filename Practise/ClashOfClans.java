import java.util.Scanner;

public class ClashOfClans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] attackStr = scanner.nextLine().split(" ");
        String[] troopsStr = scanner.nextLine().split(" ");
        String[] categoryStr = scanner.nextLine().split(" ");
        int barrackSpace = Integer.parseInt(scanner.nextLine());


        int n = attackStr.length;
        int[] attack = new int[n];
        int[] troops = new int[n];
        int[] category = new int[n];
        
        for (int i = 0; i < n; i++) {
            attack[i] = Integer.parseInt(attackStr[i]);
            troops[i] = Integer.parseInt(troopsStr[i]);
            category[i] = Integer.parseInt(categoryStr[i]);
        }

        int result = maxDPS(attack, troops, category, barrackSpace);
        System.out.println(result);
    }

    private static int maxDPS(int[] attack, int[] troops, int[] category, int barrackSpace) {
        int n = attack.length;
        int[] dp = new int[barrackSpace + 1];

        for (int i = 0; i < n; i++) {
            for (int j = barrackSpace; j >= troops[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - troops[i]] + attack[i]);
            }
        }

        return dp[barrackSpace];
    }
}
