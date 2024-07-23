package TestScores;
import java.util.Scanner;
public class Scores {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        System.out.println("Enter the Grade: ");
        int num1 = grade.nextInt();

        if (num1 >= 90) {
            System.out.println("A :D");
        } else if (num1 >= 80) {
            System.out.println("B :)");
        } else if (num1 >= 70) {
            System.out.println("C :/");
        } else if (num1 >= 60) {
            System.out.println("D :(");
        } else {
            System.out.println("F >:(");
        }

    }
}
