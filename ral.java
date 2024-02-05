import java.util.Scanner;

public class ral {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int T = scanner.nextInt();

        int[][] cardboardPieces = new int[T][4];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                cardboardPieces[i][j] = scanner.nextInt();
            }
        }

        int totalRooms = countRooms(m, n, cardboardPieces);
        double escapeRate = (double) (totalRooms - 1) / (m * n) * 100; // Subtract 1 for the outermost room
        long roundedPercentage = Math.round(escapeRate);

        System.out.println(roundedPercentage);
    }

    private static boolean isValidPoint(int x, int y, int m, int n) {
        return 0 <= x && x <= m && 0 <= y && y <= n;
    }

    private static int countRooms(int m, int n, int[][] cardboardPieces) {
        int totalRooms = 1; // Initialize with the outermost room

        for (int[] piece : cardboardPieces) {
            int x1 = piece[0];
            int y1 = piece[1];
            int x2 = piece[2];
            int y2 = piece[3];

            if (x1 == x2) { // Vertical cardboard piece
                for (int y = Math.min(y1, y2); y < Math.max(y1, y2); y++) {
                    if (isValidPoint(x1, y, m, n)) {
                        totalRooms++;
                    }
                }
            } else { // Horizontal cardboard piece
                for (int x = Math.min(x1, x2); x < Math.max(x1, x2); x++) {
                    if (isValidPoint(x, y1, m, n)) {
                        totalRooms++;
                    }
                }
            }
        }

        return totalRooms;
    }
}
