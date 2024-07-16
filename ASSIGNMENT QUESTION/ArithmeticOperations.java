import java.util.Scanner;

 class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print the sum
        System.out.println("Sum: " + (num1 + num2));

        // Calculate and print the difference
        System.out.println("Difference: " + (num1 - num2));

        // Calculate and print the product
        System.out.println("Product: " + (num1 * num2));

        // Calculate and print the division
        System.out.println("Division: " + (num1 / (float) num2));

        // Calculate and print the remainder
        System.out.println("Remainder: " + (num1 % num2));
    }
}
