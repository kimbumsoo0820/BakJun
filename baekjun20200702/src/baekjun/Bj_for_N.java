package baekjun;
import java.util.Scanner;
public class Bj_for_N {
	public static void main(String[] args) {
		
		// N���� ��������
		/*Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		for(int i =1; i<=A; i++) {
			System.out.println(i);
		}
		*/
		
		//N ���� ��������
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int b=0;
		for(int i=0; i<A ;i++) {
			System.out.println(A-b);
			b++;
			
		}
		
		
	}

}
