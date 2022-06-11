


package steps;

import java.util.Scanner;

public class moving {
	int num;	
	public int m1() {
			
		if(num %2==0)
		System.out.println("number is even" );
		else
			System.out.println("  number is odd");
		return 0;
	}
 

	public static void main(String[] args) {
		Scanner y=new Scanner(System.in);
		System.out.println(  "  enter number ");
		int num=y.nextInt();
		
		moving ob=new moving();
		ob.m1();
	}

}
