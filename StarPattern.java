package java_handson;

import java.util.Scanner;

public class StarPattern {

public static void main(String[] args)	{
	Scanner sc= new Scanner(System.in);
	int star_count=sc.nextInt();
	for(int i=0;  i<2*star_count - 1; i++) {
		for(int j=i+1; j<star_count;j++) {
			System.out.print(" ");
		}
		for(int j=star_count+1;j<2*star_count - 1;j++) {
			System.out.print(" ");
		}
		System.out.print("*");
	
	}
	
	  
}
	
}


/*
 0008000------ 4-----0123_567
 0088800------345-------012__67
 0888880-----12345----0_____7
 8888888----1234567----
*/