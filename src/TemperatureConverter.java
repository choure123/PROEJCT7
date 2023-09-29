import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.print("Enter a temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.println( " enter the value  c ( celsius ) and f is (faharenherit)");
        char unit = scanner.next().charAt(0);
        double convertedTemperature;
        if (unit == 'C' || unit == 'c') {
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println("Converted temperature in Fahrenheit: " + convertedTemperature + " °F");
        } else if (unit == 'F' || unit == 'f') {

            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println("Converted temperature in Celsius: " + convertedTemperature + " °C");
        } else {
            System.out.println("Invalid unit of measurement. Please enter 'C' or 'F'.");
        }

        scanner.close();
    }
}
