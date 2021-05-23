package Easy;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

/*
Input:
ABbCcc
Good luck in the Facebook Hacker Cup this year!
Ignore punctuation, please :)
Sometimes test cases are hard to make up.
So I just go consult Professor Dalves
Output:
152
754
491
729
646
*/	

public class BeautifulStrings {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Shalini\\Desktop\\Input.txt");
		try {
			Scanner sc =new Scanner(file);
			
			while(sc.hasNextLine())
			{
				LinkedHashMap<Character,Integer> count =new LinkedHashMap<Character,Integer>();
				String tempStr=sc.nextLine();
				tempStr=tempStr.toUpperCase();
				tempStr = tempStr.replaceAll("[^a-zA-Z]", "");  
				
				char[] Str=tempStr.toCharArray();
				
				  for(char c :Str) { 
					  if(count.containsKey(c)) 
						  count.put(c, count.get(c)+1);
					  else 
						  count.put(c, 1); 
					  } 
				  
				  Integer[] count1=count.values().toArray(new Integer[0]);
				  Arrays.sort(count1,Collections.reverseOrder());
				  int val=26;
				  int sum=0;
				  for(int i=0;i<count1.length;i++)
				  {
					  sum=sum+count1[i]*val;
					  val--;
				  }
				  System.out.println(sum);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		

	}

}
