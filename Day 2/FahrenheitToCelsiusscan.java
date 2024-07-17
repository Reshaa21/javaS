import java.util.Scanner;

class FahrenheitToCelsiusscan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit temperature: ");
        double fahrenheit = sc.nextDouble();
        double celsius = celsius(fahrenheit);
        System.out.println("Celsius temperature is = " + celsius);
    }

    static double celsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
