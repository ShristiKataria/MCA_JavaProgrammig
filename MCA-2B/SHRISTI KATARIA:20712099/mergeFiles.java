/*SHRISTI KATARIA
 MCA 2B
student id: 20712099
 */
package myFiles;
import java.io.*;
import java.lang.*;
public class mergeFiles {

	public static void main(String[] args) {
		try {
			File f1=new File("one1.txt");
			   f1.createNewFile();
		File f2=new File("two2.txt");
		   f2.createNewFile();
	PrintWriter pw1=new PrintWriter("C:\\Users\\91883\\OneDrive\\Desktop\\myFiles\\one1.txt");
	pw1.write("Hello Java");
	pw1.write("\nSoon you will be a Software Engineer");
	pw1.write("\n I'm a MCA student.");
	pw1.write("\n GEHU Dehradun.");
	pw1.write("\n Keep going.");
	System.out.println("Task Accomplished for file name one");
	pw1.flush();
	pw1.close();
PrintWriter pw2=new PrintWriter("C:\\Users\\91883\\OneDrive\\Desktop\\myFiles\\two2.txt");
	pw2.write("OOPS! You are good.");
	pw2.write("ASIA IS THE LARGEST CONTINENT");
	pw2.write("\nINDIA IS THE SEVENTH LARGEST COUNTRY");
	pw2.write("\nwhale is the largest mammal");
	pw2.write("\nkiwi and ostrich cannot fly");
	pw2.write("\n trunk of elephant is made of ivory");
	System.out.println("Task Accomplished for file name two");
	pw2.flush();
	pw2.close();
  
	System.out.println("Task Accomplished File Merged");
	System.out.println("After merging content of third  file ->");
	PrintWriter pw3=new PrintWriter(fd,"file3.txt");
	 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91883\\OneDrive\\Desktop\\myFiles\\one1.txt"));
	 BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\91883\\OneDrive\\Desktop\\myFiles\\two1.txt"));
	 
	 String line=br.readLine();
	 String line1=br2.readLine();
	 while(line!= null&&line1!=null)
     {pw3.println(line);
     pw3.println(line1);
         line=br.readLine();
         line1=br2.readLine();
     }
     /* always close the file after use */
     pw3.flush();
	 br.close();
     br2.close();
     pw3.close();
     System.out.println("Merged");
	
		}
			catch(IOException i) {
				i.printStackTrace();
			}
		}
	}
