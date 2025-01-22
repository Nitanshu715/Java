import java.util.Scanner;

public class markss {

    public static void main(String[] args) {
        // Get input fromser
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks in subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks in subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks in subject 3: ");
        int subject3 = scanner.nextInt();
        scanner.close();

        // Calculate the average marks
        double average = (subject1 + subject2 + subject3) / 3.0; 

        // Determine the grade
        char grade; 
        if (average >= 90) {
            grade = 'A'; 
        } else if (average >= 75) {
            grade = 'B'; 
        } else if (average >= 50) {
            grade = 'C'; 
        } else {
            grade = 'F'; 
        }

        // Print the results
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade); 
    }
}