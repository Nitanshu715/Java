public class pattern {
    public static void main(String[] args) {
        int n = 5; // You can modify this to change the size of the pattern

        for (int i = n; i >= 1; i--) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}