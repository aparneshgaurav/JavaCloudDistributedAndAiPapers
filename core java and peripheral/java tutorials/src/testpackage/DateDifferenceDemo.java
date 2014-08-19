package testpackage;

import java.util.Date;

public class DateDifferenceDemo {
	public static void main(String args[]){

		Date startDate=new Date("01/05/2008");

		System.out.println(startDate);
		Date endDate=new Date("01/15/2008");
		System.out.println(endDate);

		int milliStartDate=(int)startDate.getTime();
		int milliEndDate=(int)endDate.getTime();

		int differenceNumberOfDays=(milliEndDate-milliStartDate)/(60*60*1000*24);

		System.out.println("Difference in the number of days is : "+differenceNumberOfDays);
		
	}
}
