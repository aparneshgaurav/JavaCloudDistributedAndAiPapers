package testpackage;
public class ArrayDogAnimalDemo {
	public static void main(String[] args) {	
		Dog[] dogs =new Dog[10];
		int i;
		
		Animal[] animals=new Animal[10];
		
		animals=dogs;
		
		
		/*
		for(int i=0;i<dogs.length;i++){
			
			// see the difference what happens when these following lines are there and when they are removed
			// In case , these lines are not there, it throws a NullPointerException .
			Dog dog =new Dog(2);
			dogs[i]=dog;
			
			
			
			System.out.println(dogs[i].legs);
		}*/
	}
}
