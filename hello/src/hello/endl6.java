package hello;
//import java.util.*;
import java.util.Scanner;
public class endl6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
//    String s=in.nextLine();
    int second=in.nextInt();
    int minute=second/60;
    int resecond=minute%60;
    System.out.println(second+" second is "+minute+" minutes and "+resecond+" second ");
    
    
    
    
    in.close();
	}

}
