package javatutorial;


    class LuxuryCar{
    	
	// INSTANCE VARIBLES OF CLASS
	int modelNumber;
	String colour;
	
	public int getModelNumber() {
		return modelNumber;
	}
	
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}

public class AccessingInstanceVariablesDemo {
	public static void main(String[] args) {

		
		LuxuryCar car=new LuxuryCar();
		
		// so,at this point constructor will be revisited.A default constructor
		// is called.But we see that in our Car class we have not wriiten any
		// default constructor.If we dont write ,then the compiler provides a 
		// default constructor and initialises the instance variables to null(String)
		// and zero(int).




		System.out.println("the model number of the Car before setting values is "+car.getModelNumber());
		System.out.println("the colour of the Car before setting values is "+car.getColour());

		System.out.println("The values have been set"); 
		
        //Here ,the values of the instance variables are set
		car.setModelNumber(1000);
		car.setColour("black");

		System.out.println("the  model number of the Car is "+car.getModelNumber());
		System.out.println("the colour of the Car is "+car.getColour());


	}
}

// OUTPUT
/*the model number of the Car before setting values is 0
the colour of the Car before setting values is null
The values have been set
the  model number of the Car is 1000
the colour of the Car is black*/
