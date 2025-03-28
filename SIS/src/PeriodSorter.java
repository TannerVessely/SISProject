import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PeriodSorter {

	public static void runPeriodSort()
	{
		Scanner scn = new Scanner(System.in);
		
		int studentNum = 1;
		ArrayList<Student> periodSorted = TextReader.getStudentInfo();
		
		System.out.println("Enter the period (1 - 3) that you would like to sort by: ");
		
		try
		{
			int choice = scn.nextInt();
			
			
			if(choice == 1)
			{
				Collections.sort(periodSorted, new Period1Comparator());
				
				for(Student s : periodSorted)
				{
					System.out.println(studentNum + ".) " +  s.getPeriodOne() + ": " + s.getLastName() + ", " + s.getFirstName());
					studentNum++;
				}
			}
			else if(choice == 2)
			{
				Collections.sort(periodSorted, new Period2Comparator());
				

				for(Student s : periodSorted)
				{
					System.out.println(studentNum + ".) " +  s.getPeriodTwo() + ": " + s.getLastName() + ", " + s.getFirstName());
					studentNum++;
				}
			}
			else if(choice == 3)
			{
				Collections.sort(periodSorted, new Period3Comparator());
				
				for(Student s : periodSorted)
				{
					System.out.println(studentNum + ".) " +  s.getPeriodThree() + ": " + s.getLastName() + ", " + s.getFirstName());
					studentNum++;
				}
			}
			else
			{
				System.out.println("what");
			}
		
		
		
			SortStudentsSubmenu.sortStudents();
			scn.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("what");
			SortStudentsSubmenu.sortStudents();
		}
		
	}
}
