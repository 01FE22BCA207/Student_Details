import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Student_Details {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student_name = "Vijay S Aralimatti";

        System.out.print("Enter date of birth (YYYY-MM-DD) : ");
        String input_dob = scanner.next();

        Student_Details student1 = new Student_Details();
        student1.display_student_name(student_name);
        student1.display_student_DOB(input_dob);

        scanner.close();
    }

    public void display_student_name(String name) {
        System.out.println("Student name : " + name);

    }

    public void display_student_DOB(String date) {
        LocalDate dob = LocalDate.parse(date);
        System.out.println("Student age : " + calculateAge(dob));

    }

    public static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        // calculates the amount of time between two dates and returns the years
        if ((dob != null) && (curDate != null)) {
            return Period.between(dob, curDate).getYears();
        } else {
            return 0;
        }
    }

}