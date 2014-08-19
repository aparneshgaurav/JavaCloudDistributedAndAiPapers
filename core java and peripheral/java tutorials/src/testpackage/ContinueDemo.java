package testpackage;

import java.util.ArrayList;

public class ContinueDemo {

	public static void main(String[] args) {


		String[] str={"a","b","c","d","e"};
		
		ArrayList<String> strList=new ArrayList<String>();
		
        int j=str.length;
		
		for(int i=0;i<str.length;i++){
			
            
			String strLocal=str[i];
			
			if(strLocal=="c"){
				System.out.println("matched");
				j=i;
			}
			
			if(i>j){
			strList.add(strLocal);
			}
		
		}
		
		System.out.println(strList);

	}

}
