public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 32, 22, 54, 39, 53, 19};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
