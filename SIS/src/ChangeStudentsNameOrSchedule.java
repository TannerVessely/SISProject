import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeStudentsNameOrSchedule
	{
		public static void StudentIsChanging()
		{
			System.out.println("You chose to change a students grade/schedule");
			
			System.out.println("Do you want to:");
			System.out.println("1. Change Grade");
			System.out.println("2. Switch Classes");
			System.out.println("3. Go Back to the Main Menu");
			
			try
			{
				Scanner userInput = new Scanner (System.in);
				int newAnswer = userInput.nextInt();
				
				
				if(newAnswer == 1) //change grade
					{
						GradeChangeSubmenu.GradeIsChanging();
					}
				
				
				else if(newAnswer == 2) //switch classes
					{
						ScheduleChangeSubmenu.ScheduleIsChanging();
					}
				
				else if(newAnswer == 3) //go back to main menu
					{
						MenuScreen.menuRunning(); 
					}
				
				else
					{
						System.out.println("That is not an option");
						ChangeStudentsNameOrSchedule.StudentIsChanging(); 
						System.out.println();
					}
			}
			catch(InputMismatchException e)
			{
				System.out.println("what");
				StudentIsChanging();
			}
			
			
		}
		
		
	
		
	}







