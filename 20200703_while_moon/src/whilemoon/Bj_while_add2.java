package whilemoon;
import java.util.Scanner;

public class Bj_while_add2 {
	public static void main(String args[]){
		
		Scanner in=new Scanner(System.in);
			
		while(in.hasNextInt()){
		
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a+b);
		
		}	
		in.close();
	}
}
