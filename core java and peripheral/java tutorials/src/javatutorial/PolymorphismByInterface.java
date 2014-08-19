package javatutorial;

interface DemoInterfaceForShow{
	public void show();
}

class FighterShow implements DemoInterfaceForShow{
	public void show(){
		System.out.println("I show my fighting skills");
	}
}

class WriterShow implements DemoInterfaceForShow{
	public void show(){
		System.out.println("I show my writing skills");
	}
}

class DrivingShow implements DemoInterfaceForShow{
	public void show(){
		System.out.println("I show my driving skills");
	}
}

public class PolymorphismByInterface {
 public static void main(String args[]){
	 DemoInterfaceForShow interfaceReference;
	 
	 FighterShow fighterShow=new FighterShow();
	 WriterShow writerShow=new WriterShow();
	 DrivingShow drivingShow=new DrivingShow();
	 
	 interfaceReference=fighterShow;
	 interfaceReference.show();
	 
	 interfaceReference=writerShow;
	 interfaceReference.show();
	 
	 interfaceReference=drivingShow;
	 interfaceReference.show();
	 
 }
}

// OUTPUT
/*
I show my fighting skills
I show my writing skills
I show my driving skills
*/