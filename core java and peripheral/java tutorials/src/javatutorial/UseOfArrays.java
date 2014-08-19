package javatutorial;

public class UseOfArrays {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int result[]={10,20,30,40};
        int sum=0;
        for(int i=0;i<result.length;i++){
        	sum=sum+result[i];
        }
        System.out.println("sum is "+sum);
	}
}

// OUTPUT
/* sum is 100*/