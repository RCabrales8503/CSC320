import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double average;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;

        int count = 0;

        while (count < 5) {
            System.out.print("Enter a floating value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
                if (value > maximum) {
                    maximum = value;
                }
                if (value < minimum) {
                    minimum = value;
                }
                count++;
            } else {
                System.out.println("Please enter a valid floating number: ");
                scanner.next();
            }
        }

        average = total / 5;

        double interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Interest at 20%: " + interest);

        scanner.close();
    }
}
