package baekjun;
import java.util.Scanner;

public class Bj_for_arrlow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int []arr = new int[A];
		int B = sc.nextInt();
		
		for(int j=0; j<A; j++) {
			int C = sc.nextInt();
			arr[j]=C; 
		}
		
		for(int i=0; i<A; i++) {
			if(arr[i]<B) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
