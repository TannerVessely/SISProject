import java.util.ArrayList;
import java.util.Collections;

public class GPASorter {
	
	public static void runGPASort()
	{
		int studentNum = 1;
		ArrayList<Student> sortedGPA = TextReader.getStudentInfo();
		
		Collections.sort(sortedGPA, new GPAComparator());
		
		for(Student s : sortedGPA)
		{
			System.out.println(studentNum + ". " + s.getLastName() + ", " + s.getFirstName() + ": " + GPACalculator.calculateGPA(s));
			studentNum++;
		}
		
		SortStudentsSubmenu.sortStudents();
	}
}
