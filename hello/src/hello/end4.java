package hello;

import java.util.Scanner;

public class end4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in =new Scanner(System.in);
     System.out.println("Enter a number for radius: ");
     double radius=in.nextDouble();
     double area=radius*radius*3.14159;
     System.out.println("The area for the circle of radius "+radius+" is "+area);
     in.close();
     
	}

}
