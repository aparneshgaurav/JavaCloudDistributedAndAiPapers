package javatutorial;

public class TwoDimensionalArrayDemo {
  public static void main(String args[]){
	  int twoDim[][]=new int[2][2];
	  int i,j;
	  int data=100;
	  
	  for(i=0;i<2;i++){
		  for(j=0;j<2;j++){
			  twoDim[i][j]=data;
		  }
	  }
	  
	  System.out.println("the two dimensional array is ");
	  for(i=0;i<2;i++){
		  for(j=0;j<2;j++){
			  System.out.println("i= "+i+" j= "+j+"    content is "+twoDim[i][j]);
		  }
	  }
  }
}

// OUTPUT
/*the two dimensional array is 
i= 0 j= 0    content is 100
i= 0 j= 1    content is 100
i= 1 j= 0    content is 100
i= 1 j= 1    content is 100*/
