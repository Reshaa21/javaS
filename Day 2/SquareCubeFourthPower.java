import java.util.*;

 class SquareCubeFourthPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        double square = number * number;
        double cube = square * number;
        double fourthPower = Math.pow(number, 4);

        System.out.printf("Square: %.2f%n", square);
        System.out.printf("Cube: %.2f%n", cube);
        System.out.printf("Fourth power: %.2f%n", fourthPower);
    }
}
