package SameOrNah;
import java.util.Scanner;
public class SameNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String balling = scanner.nextLine();
        System.out.print("Enter second Text: ");
        String Dunking = scanner.nextLine();

        if (balling .equalsIgnoreCase(Dunking)) {
            System.out.println("The Text are the same.");
        } else {
            System.out.println("The Text are not the same.");
        }
    }
}
