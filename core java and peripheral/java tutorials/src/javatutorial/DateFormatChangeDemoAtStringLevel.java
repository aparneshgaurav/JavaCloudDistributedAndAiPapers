package javatutorial;

public class DateFormatChangeDemoAtStringLevel {
	public static void main(String args[]){
		// intialise the date
		String dateDemo="4/22/2012";// mm/dd/yyyy
		// call the function
		String returnedString = convertIntoDesiredFormat(dateDemo);
		// print the result string
		System.out.println(returnedString);
       
	}
	// method to format the stirng and return
	static String convertIntoDesiredFormat(String dateReceived){
		 // splitting the date on the basis of delimiter
        String str[]=dateReceived.split("/");
        // printing in the correct format
        String result=(str[2]+"-"+str[0]+"-"+str[1]);
        // print the result
        return result;
	}
}
