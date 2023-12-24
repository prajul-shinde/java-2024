package Exercises;

public class Ex2StudentGrade {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("good job");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Needs improvement");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
