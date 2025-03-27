import java.util.ArrayList;
import java.util.Scanner;

public class AddOrDeleteStudent {


    public static void addStudent() {
        Scanner userImput = new Scanner(System.in);
        ArrayList<Student> studentList = TextReader.getStudentInfo();
        
        System.out.println("Enter first name: ");
        String firstName = userImput.next();
        
        System.out.println("Enter last name: ");
        String lastName = userImput.next();
        
        System.out.println("Enter Period 1 class: ");
        String periodOne = userImput.next();
        
        System.out.println("Enter Period 1 grade: ");
        String p1Grade = userImput.next();
        
        System.out.println("Enter Period 2 class: ");
        String periodTwo =userImput.next();
        
        System.out.println("Enter Period 2 grade: ");
        String p2Grade =userImput.next();
        
        System.out.println("Enter Period 3 class: ");
        String periodThree = userImput.next();
        
        System.out.println("Enter Period 3 grade: ");
        String p3Grade = userImput.next();

        int newIndex = studentList.size() + 1; 
        Student newStudent = new Student(firstName, lastName, periodOne, p1Grade, periodTwo, p2Grade, periodThree, p3Grade, newIndex);

        studentList.add(newStudent);

        System.out.println("Student " + firstName + " " + lastName + " has been added.");
        
        TextReader.setStudentInfo(studentList);
        MenuScreen.menuRunning();
        return;
    }


    public static void deleteStudent() {
        Scanner userImput = new Scanner(System.in);
        ArrayList<Student> studentList = TextReader.getStudentInfo();

        System.out.println("Enter first name of student to delete: ");
        String firstName = userImput.next();

        System.out.println("Enter last name of student to delete: ");
        String lastName = userImput.next();

        boolean removed = studentList.removeIf(student -> 
            student.getFirstName().equalsIgnoreCase(firstName) && student.getLastName().equalsIgnoreCase(lastName));

        if (removed) {
            System.out.println("Student " + firstName + " " + lastName + " has been deleted.");
        } else {
            System.out.println("Error: Student not found.");
        }
        
        
        TextReader.setStudentInfo(studentList);
        MenuScreen.menuRunning();
        return;
    }
}


