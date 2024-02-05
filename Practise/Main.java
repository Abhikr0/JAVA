import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int solve(String s) {
        int n = s.length();
        String subset = "";

        for (int i = 0; i < 2 * n - 1; i++) {
            int left = i / 2;
            int right = left + i % 2;
            int len = s.length();

            while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                subset = s.substring(left, right + 1);
                --left;
                ++right;
            }

            if (subset.length() > 1)
                return right - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int N = scanner.nextInt();

        List<String> s = new ArrayList<>();
        int p = str.length();
        
        // Extract words from the input string and convert to lowercase
        String[] words = str.split("\\s+");
        for (String word : words) {
            s.add(word.toLowerCase());
        }

        String temp = "";
        int ind = -1; // Initialize ind
        int cnt = 0;
        int n, l;
        int c;

        do {
            c = 0;
            n = s.size();

            for (int i = 0; i < n; i++) {
                temp += s.get(i).charAt(0);
                ind = solve(temp);
                if (ind == -1)
                    c++;
                if (ind != -1)
                    break;
            }

            int len = s.size();
            if (c == len)
                break;

            s.remove(ind);
            temp = "";
            l = s.size();
        } while (n != l);

        int i = 0;
        while (s.size() > 1) {
            i = (i + N - 1) % s.size();
            s.remove(i);
        }

        System.out.println(s.get(0));
    }
}
