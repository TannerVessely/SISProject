import java.util.ArrayList;
import java.util.Collections;

public class LastNameSorter {

	public static void runLastNameSort()
	{
		int studentNum = 1;
		ArrayList<Student> lastNameSorted = TextReader.getStudentInfo();
		
		Collections.sort(lastNameSorted, new LastNameComparator());
		
		for(Student s : lastNameSorted)
		{
			System.out.println(studentNum + ". " + s.getLastName() + ", " + s.getFirstName());
			studentNum++;
		}
		
		SortStudentsSubmenu.sortStudents();
	}
}
