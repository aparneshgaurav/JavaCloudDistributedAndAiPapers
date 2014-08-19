package basicjavatutorial;

public class AJavaTryCode {
	public static void main(String args[]){
		String[] arr = {"a","b","c","d","e","f"};
		String str = "";
		for(int i =0 ;i<arr.length;i++){
			str = str + arr[i] +",";
			if(i==1||i==1+2){
				if(i!=0){
				str =str + "\n";
				}
			}
		}
		
		System.out.println(str);
	}
}
// str1 = str.replaceAll(",","\n");