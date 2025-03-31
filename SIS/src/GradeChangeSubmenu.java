import java.util.Scanner;
import java.util.ArrayList;

public class GradeChangeSubmenu
	{

		static ArrayList <Student> gradeChanged = TextReader.getStudentInfo();
				
		
		public static void GradeIsChanging()
			{
				
				
				Scanner userInput = new Scanner (System.in);
				
				System.out.println();
				System.out.println("You have chosen to switch a student's grade.");
				System.out.println("What student do you want to work with?");
				System.out.println();
				
				for(int i = 0; i < gradeChanged.size(); i++)
					{
						System.out.println(gradeChanged.get(i).getFirstName());
					}
				
				System.out.println();
				
				String studentChosen = userInput.nextLine();
				System.out.println("Alright! You chose to change " + studentChosen + "'s grade.");
				System.out.println("Finding student...");
				System.out.println();
				
				for(int i = 0; i < gradeChanged.size(); i++)
					{
						if(gradeChanged.get(i).getFirstName().equals(studentChosen))
							{
								System.out.println("Found student! Here's their information:");
								System.out.println(gradeChanged.get(i).getFirstName() + " " + gradeChanged.get(i).getLastName());
								System.out.println(gradeChanged.get(i).getPeriodOne() + " " + gradeChanged.get(i).getP1grade());
								System.out.println(gradeChanged.get(i).getPeriodTwo() + " " + gradeChanged.get(i).getP2Grade());
								System.out.println(gradeChanged.get(i).getPeriodThree() + " " + gradeChanged.get(i).getP3Grade());
								System.out.println();
								
								System.out.println("What class's grade do you want to change for " + studentChosen + "?");
								String classChosen = userInput.nextLine();
								
								System.out.println("What do you want to change their grade to?");
								String newGrade = userInput.nextLine();
								
								System.out.println("You want to change the grade in " + classChosen + " to: " + newGrade);
								
								
							}
					}
				

			}
		
	

	}
