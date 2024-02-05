import java.util.Scanner;

public class RoomOptimization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        
        int initialTotalArea = A * X;
        int totalAreaAfterExtension = initialTotalArea + Y;

        
        int roomsA_before = X;
        int roomsB_before = 0;
        int roomsC_before = 0;
        int roomsD_before = 0;

        int roomsA_after = Math.min(totalAreaAfterExtension / A, X);
        int remainingArea = totalAreaAfterExtension - (roomsA_after * A);

        int roomsB_after = Math.min(remainingArea / B, X);
        remainingArea -= roomsB_after * B;

        int roomsC_after = Math.min(remainingArea / C, X);
        remainingArea -= roomsC_after * C;

        int roomsD_after = Math.min(remainingArea / D, X);

        // Calculate the difference in the number of rooms of each type
        int diffA = roomsA_before - roomsA_after;
        int diffB = roomsB_before - roomsB_after;
        int diffC = roomsC_before - roomsC_after;
        int diffD = roomsD_before - roomsD_after;

        // Print the result
        System.out.println(diffA + " " + diffB + " " + diffC + " " + diffD);
    }
}
