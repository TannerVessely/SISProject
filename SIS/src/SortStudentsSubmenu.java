import java.util.InputMismatchException;
import java.util.Scanner;

public class SortStudentsSubmenu {
	
	public static void sortStudents()
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println("1. Sort by Last Name");
		System.out.println("2. Sort by GPA");
		System.out.println("3. Sort by Period");
		System.out.println("4. Go Back");
		System.out.println();	
		try
		{
			int choice = scn.nextInt();
			
			System.out.println();
			
			if(choice == 1)
			{
				LastNameSorter.runLastNameSort();
			}
			else if(choice == 2)
			{
				GPASorter.runGPASort();
			}
			else if(choice == 3)
			{
				PeriodSorter.runPeriodSort();
			}
			else if(choice == 4)
			{
				MenuScreen.menuRunning();
			}
			else
			{
				System.out.println("what");
				sortStudents();
			}
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("what");
			MenuScreen.menuRunning();
		}
		
		
			
	}
}
