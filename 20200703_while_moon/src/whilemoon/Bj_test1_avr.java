package whilemoon;
import java.util.Scanner;
public class Bj_test1_avr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=5;
		int []arr = new int[a];
		int result = 0;
		for(int i=0; i<5; i++) {
			int A = sc.nextInt();
			if(A<40) {
				A=40;
			}
			arr[i] = A;
			result = result + arr[i];
		}
		System.out.println(result/a);
		
		
		

	}

}
