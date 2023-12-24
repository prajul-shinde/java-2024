package Exercises;

public class Ex7FindHighestAndLowestGrade {
    public static void main(String[] args) {
        int[] grades = { 85, 90, 78, 92, 88 };
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            if (grade > highest)
                highest = grade;
            if (grade < lowest)
                lowest = grade;
        }
        System.out.println("highest grade is " + highest);
        System.out.println("lowest grade is " + lowest);
    }
}
