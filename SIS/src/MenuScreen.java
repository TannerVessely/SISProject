import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuScreen
	{

		public static void menuRunning()
		{
			
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("1. Add or delete a student");
			System.out.println("2. Change student grades/schedule");
			System.out.println("3. Sort students");
			System.out.println("4. Save all changes to text file");
			System.out.println();
			
			TextReader.refreshStudents();
		
			Scanner scn = new Scanner (System.in);
			int answer = scn.nextInt();
			try
			{
				
				
			
		
						//This will take the user to the class that changes a students grades/schedule

					
					
					if(answer == 1)
						{
						//This will take the user to the class that adds or deletes a student
						Scanner addDeleteScn = new Scanner (System.in);

						    System.out.println("Would you like to: ");
						    System.out.println("1. Add a student");
						    System.out.println("2. Delete a student");
						    
						    int choice = addDeleteScn.nextInt();
						    
						    if (choice == 1) {
						        AddOrDeleteStudent.addStudent();
						    } else if (choice == 2) {
						        AddOrDeleteStudent.deleteStudent();
						    } 
						    addDeleteScn.close();
							//This will take the user to the class that adds or deletes a student
						}
				
					else if(answer == 2)
						{
							//This will take the user to the class that changes a students grades/schedule
						
							ChangeStudentsNameOrSchedule.StudentIsChanging();
						}
				
					else if(answer == 3)
						{
							//This will take the user to the class that sorts the students

							SortStudentsSubmenu.sortStudents();
							
						}
					else if(answer == 4)
						{
						
						TextReader.writeStudentList();
						
						}
				
					else
						{
							System.out.println("That is not an option");
							menuRunning();
						}

			
					
				
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("That is not an option");
				menuRunning();
			}
			

		}
	
}