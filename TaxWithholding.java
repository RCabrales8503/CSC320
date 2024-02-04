import java.util.Scanner;

public class TaxWithholding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weekly income: ");
        double income = scanner.nextDouble();
        double taxWithholding = 0.0;

        if (income < 500) {
            taxWithholding = income * 0.1;
        } 
        else if (income >= 500 && income < 1500 ) {
            taxWithholding = income * 0.15;
        } 
        else if (income >= 1500 && income < 2500) {
            taxWithholding = income * 0.2;
        } 
        else if (income >= 2500) {
            taxWithholding = income *0.3;
        }

        System.out.println("Your average weekly withholding is: $" + taxWithholding);

        scanner.close();
    }
}
