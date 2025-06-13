package controlFlow;

public class Testing {
    public static void main(String[] args) {
        int arr[] = {23, 24, 34, 56, 23, 56, 76, 76, 43};

        for (int i = 0; i < arr.length; i++) {
            int repeat = 0;

            // Check if the element was already counted before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    repeat = 1;
                    break;
                }
            }

            if (repeat == 0) {
                int count = 1; // Start from 1 because arr[i] matches itself
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " appears " + count + " times");
            }
        }
    }
}
