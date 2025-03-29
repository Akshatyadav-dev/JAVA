import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Grade percentage
        System.out.print("Enter your grade percentage : ");
        int grade = sc.nextInt();

        // Using if-else construct to determine grade category
        if (grade >= 90){
            System.out.println("You got an A!");
        }
        else if (grade >= 75){
            System.out.println("You got a B.");
        }
        else if (grade >= 65){
            System.out.println("You got a C.");
        }
        else if (grade >= 50){
            System.out.println("You got a D.");
        }
        else{
            System.out.println("You failed the exam.");
        }

        // Using switch-case statement for additional feedback
        System.out.print("Enter your performance level (1-5) : ");
        int performance = sc.nextInt();

        switch (performance) {
            case 5:
                System.out.println("Excellent performance!");
                break;
            case 4:
                System.out.println("Great job!");
                break;
            case 3:
                System.out.println("Good effort, but there's room for improvement.");
                break;
            case 2:
                System.out.println("Need significant improvement.");
                break;
            case 1:
                System.out.println("Unsatisfactory performance.");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                break;
        }
        sc.close();
    }
}