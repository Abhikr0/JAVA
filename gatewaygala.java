import java.util.Scanner;

public class gatewaygala {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read names
        String[] names = scanner.nextLine().split(" ");

        // Read N
        int N = Integer.parseInt(scanner.nextLine());

        // First round: eliminate palindromes
        String[] remainingNames = eliminatePalindromes(names);

        // Second round: eliminate every Nth person
        String winner = eliminateEveryNth(remainingNames, N);

        System.out.println(winner);
    }

    // Eliminate palindromes from the array
    private static String[] eliminatePalindromes(String[] names) {
        int remainingCount = 0;
        String[] remainingNames = new String[names.length];

        for (String name : names) {
            // Check if the first letter of the name forms a palindrome
            if (!isPalindrome(name.charAt(0), remainingNames, remainingCount)) {
                remainingNames[remainingCount++] = name;
            }
        }

        return java.util.Arrays.copyOf(remainingNames, remainingCount);
    }

    // Check if a palindrome is formed with the given letter
    private static boolean isPalindrome(char letter, String[] names, int count) {
        for (int i = 0; i < count; i++) {
            if (names[i].charAt(0) == letter) {
                return true;
            }
        }
        return false;
    }

    // Eliminate every Nth person from the array
    private static String eliminateEveryNth(String[] names, int N) {
        int index = 0;
        int remainingCount = names.length;

        while (remainingCount > 1) {
            index = (index + N - 1) % remainingCount;
            System.arraycopy(names, index + 1, names, index, remainingCount - index - 1);
            remainingCount--;
        }

        return names[0];
    }
}
