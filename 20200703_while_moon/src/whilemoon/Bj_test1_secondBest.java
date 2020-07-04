package whilemoon;
import java.util.Scanner;
public class Bj_test1_secondBest {
	public static void main(String[] args) { // »ý°¢
		Scanner sc = new Scanner(System.in);	
		int result=0, result2=0;
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if(A<B) {
				if(B<C) {
					System.out.println(B);
				}
				else if(A<C) {
					System.out.println(C);
				}
				else {
					System.out.println(A);
				}
			}
			else {
				if(A<C) {
					System.out.println(A);
				}
				else if(B<C) {
					System.out.println(C);
				}
				else {
					System.out.println(B);
				}
			}						
	}
}
