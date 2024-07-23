package NumberComparison;
import java.util.Scanner;
public class ComparingNumb {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = numb.nextInt();
        System.out.println("Enter the second number:");
        int num2 = numb.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }

    }
}
