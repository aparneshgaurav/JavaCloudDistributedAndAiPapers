package javatutorial;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int day=0;
        
        //day=1; will envoke tuesday
        //day=6; will envoke sunday and similarly
        
        switch(day){
        case 0: System.out.println("day is Monday");
        break;
        case 1: System.out.println("day is Tuesday");
        break;
        case 2: System.out.println("day is Wedbesday");
        break;
        case 3: System.out.println("day is Thursday");
        break;
        case 4: System.out.println("day is Friday");
        break;
        case 5: System.out.println("day is Saturday");
        break;
        case 6: System.out.println("day is Sunday");
        break;
        }
	}

}

// OUTPUT

/*day is Monday*/
