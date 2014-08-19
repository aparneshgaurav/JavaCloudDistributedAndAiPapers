package exception;
public class TryCatchDemo {
	/**
	 * @author : Aparnesh
	 * @description : This class is used to show try , catch , finally,
	 * throw for custom exception , throws used for erroneous method declaring
	 * exception .
	 */
	public static void main(String args[]){
		TryCatchDemo tryCatchDemo = new TryCatchDemo();
		try {
			tryCatchDemo.run();
		}catch (Exception e) {
			System.out.println("received message is : "+e.getMessage());
		}
	}
	public static void run () throws Exception{
		try{
			// error prone code 
			Integer[] integerArray = {1,2,3};
			System.out.println(integerArray[7]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			throw new Exception(e);
		}
		catch (Exception e) {
			System.out.println(" broader exception is : "+e.getMessage());
		}
		finally{
			System.out.println("finally block");
		}
		System.out.println("after finally block");
	}
}
