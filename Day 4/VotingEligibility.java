import java.util.*;

 class VotingEligibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Welcome to vote!");
        } else {
            int yearsToVote = 18 - age;
            System.out.println("Sorry, you can't vote now! You can vote after " + yearsToVote + " years.");
        }
    }
}
