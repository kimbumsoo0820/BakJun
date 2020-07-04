package whilemoon;
import java.util.Scanner;
public class Bj_test1_Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int star1=2*A-1;
		for(int i =1; i<=A; i++) {
			for(int space1=1;space1<i;space1++) {
				System.out.print(" ");
			}
			for(int j =0; j<star1; j++) {
				System.out.print("*");
			}
			System.out.println();
			star1=star1-2;			
		}
		
		int star2=star1+2;
		for(int i=1; i<=A; i++) {
			for(int space2=A-2; space2>i-2; space2--) {
				System.out.print(" ");
			}
			for(int j=0; j<star2; j++) {
				System.out.print("*");
			}			
			star2=star2+2;
			System.out.println();			
		}		
	}
}
