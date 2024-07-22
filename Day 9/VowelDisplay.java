import java.util.Scanner;

public class VowelDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine().toLowerCase();

        System.out.print("Vowels in the given string are:");
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                System.out.print(" " + currentChar);
            }
        }
    }
}
