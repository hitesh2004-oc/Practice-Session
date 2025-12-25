package Day14;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//..........File Handling..........//
public class P1 {
	public static void main (String[] args) {
		// File Operation //
      //(1) Create File ...[You Have to Referesh Main Package]
	    File f = new File("Hitesh.txt");
	    File a = new File("Angular.txt");
	    File b = new File("SpringBoot.txt");
	    File c = new File("Js.txt");
	    try {
	 	f.createNewFile();
	    a.createNewFile();
	    b.createNewFile();
	    c.createNewFile();
	    }
		catch(Exception e){
			System.out.println(e);
			}
	  //(2) Create Folder...[You Have to Referesh Main Package]
	    File fd = new File("Data");
	    boolean s1 = fd.mkdir(); //[Using mkdir Method]
	    
	    //Create File Inside the Folder
	    File a1 = new File(f,"Test.txt");
	    
	    try {
			a1.createNewFile();
		} catch (Exception e) {
			System.out.println(e);
		}
	  
	  //(3) Display All File & Directories in Folder...
	    //Path of That Particular Folder -> D:\\TestingProject
	    File dis = new File("D:\\TestingProject");
		String[] arr = dis.list();
		
		for(String p :arr) {
			File f1 = new File(dis,p);
			if(f1.isFile()) {
				System.out.println(p+"  it is File");
			}
			if(f1.isDirectory()) {
				System.out.println(p+"  it is Folder");
			}
		}
	   //(4) Write the Data inside the File
		  try {
				FileWriter fw = new FileWriter("Hitesh.txt");
				fw.write("This is My First File Data Write");
				fw.close();
			} catch (IOException e) {
				System.out.println(e);	
			}
	   //(5) Read the File Data......
			File r = new File("Hitesh.txt");
			try {
				Scanner sc = new Scanner(r);
				while(sc.hasNextLine()) {
					String line = sc.nextLine();
						System.out.println(line);
				}
					sc.close();
				}
			catch(Exception e) {
				System.out.println(e);
				}
	  //(6) Delete the File on Exiting Folder
			if(r.delete()) {
				System.out.println("Deleted the File");
			}
			else {
				System.out.println("Not Found the File");
			}     
	}
}
