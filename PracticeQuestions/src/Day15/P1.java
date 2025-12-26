package Day15;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class P1 {
	public static void main(String[] args) throws IOException {
		//...Write File data Inside the File...//
		FileWriter fw = new FileWriter("Hitesh.txt");
		fw.write("Hello Hitesh");	
		fw.write("\nSpring Boot");
		fw.flush();
		fw.close();
		
		//...Read the File Data...//
		//(1) Logic(Approach) 
		FileReader fr = new FileReader("Hitesh.txt");
		int i =fr.read();
		while(i != -1) {
			System.out.print((char) i);
			i =fr.read();
		}
		//(2) Logic(Approach) Using BufferedReader
		BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        while(s!= null) {
        	System.out.println(s);
        	s = br.readLine();
        }
        br.close();
        
        //(3) Logic(Approach) 
		Scanner sc = new Scanner(fr);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}

	}

}
