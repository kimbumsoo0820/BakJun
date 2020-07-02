package baekjun;
import java.util.Scanner;


public class Bj_for_99 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A =sc.nextInt();
		int result=0;

	
		for(int i=1; i<=A; i++) {
			result = result+i ;
		}
		System.out.println(result);
	}

}
