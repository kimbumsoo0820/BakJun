package whilemoon;
import java.util.Scanner;
public class Bj_while_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A==0 && B ==0) {
				break;
			}
			System.out.println(A+B);
		}
		

	}

}
