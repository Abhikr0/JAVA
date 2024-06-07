public class q2 {
    public static void findMissing(int arr1[], int arr2[]) {
        boolean found;
        boolean missing = false;

        for (int i = 0; i < arr1.length; i++) {
            found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr1[i] + " ");
                missing = true;
            }
        }

        if (!missing) {
            System.out.println("No elements are missing");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 1, 4, 5};

        findMissing(arr1, arr2);
    }
}
