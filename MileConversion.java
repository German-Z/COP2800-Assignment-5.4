public class MileConversion {
    public static void main(String[] args) {
        // Use constant for each mile to kilometer
        final double MILE_TO_KILOMETER = 1.609;
        // DISPLAY table for conversion
        System.out.println("Miles\t\tKilometers");
        // Use for loop to display conversion of miles to kilometers
        for (int i = 1; i <= 10; i++) {
            // Display results of conversion
            System.out.printf("%d\t\t%.3f\n",i, i * MILE_TO_KILOMETER);
        }
    }
}
