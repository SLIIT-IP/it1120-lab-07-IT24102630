import java.util.Scanner;

public class it24102630labQ1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);

            // Input marks for 4 subjects
            System.out.println("Enter marks for 4 subjects)
            int mark1 = scanner.nextInt();
            int mark2 = scanner.nextInt();
            int mark3 = scanner.nextInt();
            int mark4 = scanner.nextInt();

            // Calculate average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            System.out.println("Average is: " + average);

            // Determine the grade based on the average
            String grade;
            if (average >= 70) {
                grade = "Distinction";
            } else if (average >= 60) {
                grade = "Credit";
            } else if (average >= 50) {
                grade = "Pass";
            } else {
                grade = "Fail";
            }

            // Display the overall grade
            System.out.println("Overall Grade is: " + grade);
            System.out.println();
        }
    }
}
