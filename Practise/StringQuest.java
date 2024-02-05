import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        List<String> result = new ArrayList<>();

        if (isPossible(s1, s2, 0, result)) {
            for (int i = 0; i < result.size(); ++i) {
                System.out.print(result.get(i));
                if (i < result.size() - 1) {
                    System.out.print('|');
                }
            }
        } else {
            System.out.println("Impossible");
        }
    }

    private static boolean isSubstringPresent(String s, String target) {
        return s.contains(target) || s.contains(new StringBuilder(target).reverse().toString());
    }

    private static boolean isPossible(String s1, String s2, int start, List<String> result) {
        if (start == s1.length()) {
            return true;
        }

        for (int end = start + 1; end <= s1.length(); ++end) {
            String currentSubstring = s1.substring(start, end);

            if (isSubstringPresent(s2, currentSubstring)) {
                result.add(currentSubstring);

                if (isPossible(s1, s2, end, result)) {
                    return true;
                }

                result.remove(result.size() - 1);
            }
        }

        return false;
    }
}
