import java.util.*;

class swapscanner
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();

        // Swap logic
        int temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping: First number = " + first + ", Second number = " + second);
    }
}
