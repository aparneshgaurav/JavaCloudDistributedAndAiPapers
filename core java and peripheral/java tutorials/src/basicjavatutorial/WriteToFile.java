package basicjavatutorial;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
public class WriteToFile {
	public static void main(String args[]) throws IOException{
		  try{
			  // Create file 
			  FileWriter fstream = new FileWriter("D:/writeFile.txt");
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write("Hello Java"+"\n"+"Hello Activiti");
			  //Close the output stream
			  out.close();
			  }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
			  
	}
}
