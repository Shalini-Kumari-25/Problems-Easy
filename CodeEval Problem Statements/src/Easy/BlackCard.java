package Easy;

import java.io.File;
import java.util.Scanner;

/*
Input:
John Sara Tom Susan | 3
John Tom Mary | 5
Output:
Sara
Mary
*/	
class BlackCard {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Shalini\\Desktop\\Input.txt");
		try {
			Scanner sc = new Scanner(file);
		
		    while (sc.hasNextLine())
		    {
		    
		    	String temp = sc.nextLine();
		    	char c=temp.charAt(temp.length()-1);
		    	int num=Character.getNumericValue(c);
		    	
			    temp=temp.replaceAll("[^A-Za-z]"," ");
			    String str[]=temp.split(" ");
			   
			    int length=str.length;
			    int diff =Math.abs(length-num);
			   
			    System.out.println(str[diff]);
			    
		    }
		    sc.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

		

	}

}
