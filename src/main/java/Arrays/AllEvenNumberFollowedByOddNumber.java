package Arrays;

public class AllEvenNumberFollowedByOddNumber {

    public static void main(String[] args) {
        int arr[] = {5, 12, 4, 21, 8, 2, 3, 7, 9, 11};

        // Print all even numbers first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        // Print all odd numbers next
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
