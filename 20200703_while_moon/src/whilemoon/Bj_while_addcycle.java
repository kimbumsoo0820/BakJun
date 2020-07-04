package whilemoon;
import java.util.Scanner;

public class Bj_while_addcycle {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = A;
		int count=0;
		int a=0, b=0,c=0;
		while(true) {
			a=A/10;
			b=A%10;
			c=(a+b)%10;
			A=(b*10)+c;
			count++;
			if(B==A) {
				break;
			}						
		}
		System.out.println(count);		
	}
}
