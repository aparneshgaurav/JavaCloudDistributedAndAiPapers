package basicjavatutorial;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
public class ReadFromFile {

	/*@method description : This method adds two integers , two inputs are declared as integers,they are added and 
	stored in a sum variable.The results are printed accordingly.*/
	public static void main(String args[]) throws IOException{
		
		File file = new File("D:/fb/Cluster-ad.csv");
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		String line = "";
		String str = "";
		while((line=bufferedReader.readLine())!=null){
		System.out.println(line);
		str = str+line;
		}
	    System.out.println(str);
	}
}


// output
/*
This is an addition demonstration program
The first number being added is 100
The second number being added is 2250
The result expected on the addition of the first number and the second number is 2350
*/


