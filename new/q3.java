import java.util.*;

public class q3 {

    public static void searchEle(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("key not found");
    }

    public static void main(String[] args) {
        int key = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        searchEle(arr, key);
    }
}
