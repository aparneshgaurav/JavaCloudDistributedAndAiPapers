package testpackage;
public class TestDates {
	public static void main(String[] args) {
		 String dateStringFormat1="2008-01-05";
			int i;
		    String[] arrayString=dateStringFormat1.split("-");
		    char[] charArray=arrayString[1].toCharArray();
		    char[] charArray1=arrayString[2].toCharArray();   
		    System.out.println(charArray[1]+"/"+charArray1[1]+"/"+arrayString[0]);
		 }
}
