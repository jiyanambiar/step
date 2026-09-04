import java.util.Scanner;

public class BMICalculatorForTeam {
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        }
        if (bmi < 25.0) {
            return "Normal";
        }
        if (bmi < 30.0) {
            return "Overweight";
        }
        return "Obese";
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        if (heights.length != weights.length) {
            throw new IllegalArgumentException("Heights and weights must have the same number of entries.");
        }

        System.out.printf("%-8s %-12s %-13s %-8s %s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("%-8d %-12.2f %-13.1f %-8.2f %s%n",
                    i + 1, heights[i], weights[i], bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int people = scanner.nextInt();
        while (people <= 0) {
            System.out.print("Please enter a positive number of people: ");
            people = scanner.nextInt();
        }

        double[] heights = new double[people];
        double[] weights = new double[people];
        for (int i = 0; i < people; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Height in metres: ");
            heights[i] = scanner.nextDouble();
            System.out.print("Weight in kilograms: ");
            weights[i] = scanner.nextDouble();
            while (heights[i] <= 0 || weights[i] <= 0) {
                System.out.println("Height and weight must be positive.");
                System.out.print("Height in metres: ");
                heights[i] = scanner.nextDouble();
                System.out.print("Weight in kilograms: ");
                weights[i] = scanner.nextDouble();
            }
        }

        System.out.println("\nCorporate Wellness Report");
        printWellnessReport(heights, weights);
        scanner.close();
    }
}
