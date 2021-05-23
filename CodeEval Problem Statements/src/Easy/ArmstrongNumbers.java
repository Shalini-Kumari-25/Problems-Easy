package Easy;

import java.io.File;
import java.util.Scanner;

/*
Input:
6
153
351
Output:
True
True
False
*/	

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\Shalini\\Desktop\\Input.txt");
		try {
			Scanner sc = new Scanner(file);
			int num,num1,d=0,sum=0;
		
		    while (sc.hasNext())
		    {
		    
			    num = sc.nextInt();
			    System.out.println(num);
			    num1=num;
				while(num1>0)
				{
					d=num1%10;
					sum=sum+(d*d*d);
					num1=num1/10;
				}
				if(num==sum)
					System.out.println("Armstrong number");
				else
					System.out.println("Not a Armstrong number");
			    
		    }
		    sc.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
