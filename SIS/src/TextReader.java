import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextReader {
	
	
	
	private static ArrayList<Student> studentInfo = new ArrayList<Student>();
	
	public static void runFileReader()
	{
		
		int index = 1;
	
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(new File("StudentList.txt")));
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

	public static ArrayList<Student> getStudentInfo() {
		return studentInfo;
	}

	public static void setStudentInfo(ArrayList<Student> studentInfo) {
		TextReader.studentInfo = studentInfo;
	}
	
	public static void refreshStudents()
	{
		setStudentInfo(new ArrayList<Student>());
		
		runFileReader();
	}
	
	
	
	
}
