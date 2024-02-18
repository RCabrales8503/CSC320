import java.util.Scanner;

public class WeeklyTemps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Corrected Scanner object

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        double[] temps = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter average temp for " + daysOfWeek[i] + ": ");
            temps[i] = scanner.nextDouble();
        }

        System.out.print("Enter day of week(Monday through Sunday) or 'week' for summary: ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("week")) {
            double sum = 0;  // Corrected accumulation variable
            for (double temp : temps) {
                sum += temp;  // Add each temperature to sum
            }

            double weeklyAvg = sum / temps.length;

            System.out.println("Weekly Summary:");
            for (int i = 0; i < 7; i++) {
                System.out.println(daysOfWeek[i] + ": " + temps[i]);
            }
            System.out.println("Weekly Average Temp: " + weeklyAvg);
        } else {
            boolean found = false;
            for (int i = 0; i < 7; i++) {
                if (input.equalsIgnoreCase(daysOfWeek[i])) {  // Corrected comparison
                    System.out.println("Temperature on " + daysOfWeek[i] + ": " + temps[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {  // Redundant check, but can be kept for clarity
                System.out.println("Bad input. Please enter a valid day of week or 'week' for summary");
            }
            scanner.close();
        }
    }
}

