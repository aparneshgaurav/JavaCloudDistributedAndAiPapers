package basicjavatutorial;

public class ParseDemo {
	public static void main(String args[]){
		String[] str={"cat","dog","animal"};
		String result=null;
		for(int i=0;i<str.length;i++){
			result=result+str[i]+",";
		}
		System.out.println(result.substring(4,result.length()-1));
	}
}
