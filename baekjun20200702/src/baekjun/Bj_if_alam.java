
package baekjun;
import java.util.Scanner;


public class Bj_if_alam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		

		if(B<45) {
			A--;
			if(A<0) {
				A=24-1;
			}
			B=60+(B-45);
		}
		else if(B>=45) {
			B=B-45;
		}
		
		System.out.println(A+" "+B);
	}

}
