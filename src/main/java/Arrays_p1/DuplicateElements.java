package Arrays_p1;


public class DuplicateElements {

    public static void main(String[] args) {
        String arr[] = {"java", "Python", "Ruby", "java", "c++"};
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Use .equals() to compare string values
                if (arr[i].equals(arr[j])) {
                    System.out.println("Found duplicate element in the array: " + arr[i]);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println("No duplicate elements found.");
        }
    }
}

