package basicjavatutorial;
class Car{
	int modelNumber;
	
	public void show(){
		System.out.println("Hi this is the method demo ");
	}
	
}
public class MethodsDemo {
public static void main(String args[]){
	Car car =new Car();
    car.show();
	car.modelNumber=2000;
    int carModelNumber=car.modelNumber;
    System.out.println(carModelNumber);
  }
}
//Hi this is the method demo 
//2000