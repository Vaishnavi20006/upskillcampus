import java.util.Scanner;

public class CropProductionPrediction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Crop Production Prediction System");

        System.out.print("Enter area of land (in acres): ");
        double area = sc.nextDouble();

        System.out.print("Enter rainfall (in mm): ");
        double rainfall = sc.nextDouble();

        System.out.print("Enter fertilizer used (in kg): ");
        double fertilizer = sc.nextDouble();

        double production = (area * 2) + (rainfall * 0.5) + (fertilizer * 1.5);

        System.out.println("Predicted Crop Production is: " + production + " units");

        sc.close();
    }
}
