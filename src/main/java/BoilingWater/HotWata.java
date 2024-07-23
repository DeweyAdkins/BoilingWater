package BoilingWater;
import java.util.Scanner;
public class HotWata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature 200 - 220: ");
        int num = scanner.nextInt();
        if (num >= 212) {
            System.out.println("Water is BOILING!!!!!!");
        } else {
            System.out.println("Water is not BOILING!!!!!!");
        }

    }
}
