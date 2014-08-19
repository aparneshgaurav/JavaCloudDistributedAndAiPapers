package basicjavatutorial;

// Box is taken as the domain class.It has got mehod volume and instance variables.
class Box{
	int length, breadth, height, volume;
	public void volume(int boxInstanceLengthReceived,int boxInstanceBreadthReceived,int boxInstanceHeightReceived){
		volume=(boxInstanceLengthReceived*boxInstanceBreadthReceived*boxInstanceHeightReceived);	
	    System.out.println(volume+"cm3");
	}
	
}

// VolumeDemo is taken as the application. Two instances of the domain class box are instantiated , they are
// fashionBox and shavingBox , each instance is accorded a different set of dimensions and when the volume method
// is invoked on those two instances , then we see different volumes for the two separate instances or objects.
public class VolumeDemo {
	public static void main(String[] args) {
	// instance one or you may say object one
	Box fashionBox=new Box();
	fashionBox.length=10;
	fashionBox.height=10;
	fashionBox.breadth=10;
	fashionBox.volume(fashionBox.length,fashionBox.breadth,fashionBox.height);
   
	// instance two or object two .
	Box shavingBox=new Box();
	shavingBox.length=5;
	shavingBox.height=5;
	shavingBox.breadth=5;
	shavingBox.volume(shavingBox.length,shavingBox.breadth,shavingBox.height);
   
	
	}
}

/*
1000cm3
125cm3
*/
