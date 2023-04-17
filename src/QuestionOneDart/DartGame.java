package practise;

import java.util.Scanner;

public class DartGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the X-coordinate of the dart: ");
        double x = input.nextDouble();
        System.out.print("Enter the Y-coordinate of the dart: ");
        double y = input.nextDouble();
        int points = score(x, y);
        if (points == 0) {
            System.out.println("Dart is outside the target, earned 0 points");
        }
        System.out.println("Dart landed at (" + x + ", " + y + ") and earned " + points + " points");
    }

    public static int score(double x, double y) {
        double area = Math.sqrt(x * x + y * y);
        if (area > 10) {
            return 0;
        } else if (area > 5) {
            return 1;
        } else if (area > 1) {
            return 5;
        } else {
            return 10;
        }
    }
}
