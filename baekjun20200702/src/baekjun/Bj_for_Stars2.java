package baekjun;
import java.util.Scanner;
public class Bj_for_Stars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int space=A-1;
		for(int i=1; i<=A; i++) {
			for(int j=0;j<space;j++) {
				System.out.print(" ");
				
			}
			
			for(int k=0;k<(A-space);k++) {
				System.out.print("*");
			}
			space--;
			System.out.print("\n");
			
		}

	}

}
