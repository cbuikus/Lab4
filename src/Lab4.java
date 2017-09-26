import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int userAge = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your age: ");
        userAge = scnr.nextInt();

        if (userAge > 0 && userAge <= 12) {
            System.out.print("You are a child.");
        }

        if (userAge >= 13 && userAge <= 17) {
            System.out.print("You are a teenager.");
        }
        if (userAge >= 18) {
            System.out.print("You are an adult.");
        }

        if (userAge == 0) {
            System.out.println("Not a valid age.");

        }

    }
}