import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {
	
	
	
	private static ArrayList<Student> studentInfo = new ArrayList<Student>();
	private static String fileName = "StudentList.txt";
	
	public static void runFileReader()
	{
		
		int index = 1;
	
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
			String line = br.readLine();
			
			while(line != null)
			{
				
				//System.out.println(line);
				String[] tempStudent = line.split(" ");
				studentInfo.add(new Student(tempStudent[0], tempStudent[1], tempStudent[2], tempStudent[3], tempStudent[4], tempStudent[5], tempStudent[6], tempStudent[7], index));
				index++;
				line = br.readLine();
			}
				
			
		} 
		catch(IOException e)
		{
			System.out.println("Whoops, an error occured reading the file.");
			
		}
		
	}
	public static void writeStudentList()
	{
		
		
		try
		{
		    FileWriter fileWriter = new FileWriter(fileName, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for(int i = 0; i < studentInfo.size(); i++)
			{
				//System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getPeriodOne() + " " + s.getP1grade() + " " + s.getPeriodTwo() + " " + s.getP2Grade() + " " + s.getPeriodThree() + " " + s.getP3Grade());

				bufferedWriter.write(studentInfo.get(i).getFirstName() + " " + studentInfo.get(i).getLastName() + " " + studentInfo.get(i).getPeriodOne() + " " + 
				studentInfo.get(i).getP1grade() + " " + studentInfo.get(i).getPeriodTwo() + " " + studentInfo.get(i).getP2Grade() + " " + studentInfo.get(i).getPeriodThree() 
				+ " " + studentInfo.get(i).getP3Grade() + ((i == studentInfo.size() - 1) ? "" : "\n"));
			}
				bufferedWriter.close();
	
		} 
		catch(IOException e)
		{
			System.out.println("Whoops, an error occured writing to the file.");
			
		}
	}

	public static ArrayList<Student> getStudentInfo() {
		return studentInfo;
	}

	public static void setStudentInfo(ArrayList<Student> students) {
		studentInfo = students;
	}
	
	public static void refreshStudents()
	{
		setStudentInfo(new ArrayList<Student>());
		
		runFileReader();
	}
	
	
	
	
}
