package array;

// TC - O(N)
// SC - O(1)
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { -1, 64, -445, 555 };

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest)
                secondLargest = arr[i];
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second Largest number: " + secondLargest);
    }
}