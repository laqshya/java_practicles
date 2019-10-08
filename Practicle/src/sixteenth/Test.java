package sixteenth;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException; 
import java.io.FileReader;
public class Test 
{
	public static void main(String[] args) throws IOException
	{
		int choice;
		StringBuffer s = new StringBuffer("Lakshya is good in java");
		do {
			System.out.println("what do u want to do with string \r\n1) Replace the content of StringBuffer with the user given string.\r\n" + 
					"2) Reverse the content of StringBuffer.\r\n" + 
					"3) Append a value to StringBuffer at the end.\r\n" + 
					"4) Remove a particular character from the StringBuffer.\r\n" + 
					"5) Insert a value at a particular offset in StringBuffer.\r\n" + 
					"6) Convert StringBuffer into String using toString () method of String class.\r\n" + 
					"7) Trim the content Of StringBuffer using substring () method Of String class.\r\n" + 
					"8) Write the contents of StringBuffer to file using BufferedWriter & FileWriter Java class.");
			
			Scanner sc =new Scanner(System.in);
			choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1:
				System.out.println("Entre the name with which you want to replace lakshya");
				String n = sc.nextLine();
				s.replace(0,7,n);
				System.out.println("replaced string:"+s);
				break;
			case 2:
				s.reverse();
				System.out.println("reversed string:"+s);
				break;
			case 3:
				s.append(":" + true);
				System.out.println("appended string:"+s);
				break;
			case 4:
				s.deleteCharAt(6);
				System.out.println("appended string:"+s);
				break;
			case 5:
				s.setCharAt(6, ' ');
				System.out.println("changed string:"+s);
				break;
			case 6:
				System.out.println("Stringbuffer converted to string"+s.toString());
				break;
			case 7:
				System.out.println("name in the sentence using substring method : "+s.substring(0,7));
				break;
			case 8:
				FileWriter fw = new FileWriter("Practicle.txt");
				for(int i =0; i < s.length() ; i++ )
				{
					fw.write(s.charAt(i));
				}
				System.out.println("Writing successful");
				fw.close();
				break;
			case 9:
				
				 
			
			}
		}while(choice!=10);
	}
}