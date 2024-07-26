import java.util.*;

class StudentIn {
    String name;
    int mark1;
    int mark2;
    int mark3;
    int mark4;

    StudentIn(String name, int m1, int m2, int m3, int m4) {
        name = name;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
    }

    double calculateTotal() {
        return mark1 + mark2 + mark3 + mark4;
    }

    double calculateAggregate() {
        return calculateTotal() / 4.0;
    }

    String getGrade() {
        double aggregate = calculateAggregate();
        if (aggregate > 75) {
            return "Distinction";
        } else if (aggregate >= 60) {
            return "First Division";
        } else if (aggregate >= 50) {
            return "Second Division";
        } else if (aggregate >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Mark 4: " + mark4);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Aggregate: " + calculateAggregate());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter mark1: ");
        int mark1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        int mark2 = sc.nextInt();
        System.out.print("Enter mark3: ");
        int mark3 = sc.nextInt();
        System.out.print("Enter mark4: ");
        int mark4 = sc.nextInt();

        StudentIn student = new StudentIn(name, mark1, mark2, mark3, mark4);
        student.displayInfo();
        sc.close();
    }
}
