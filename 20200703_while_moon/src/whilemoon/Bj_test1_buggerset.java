package whilemoon;
import java.util.Scanner;

public class Bj_test1_buggerset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 5;
		int bugger=0, drink=0;
		int []arr = new int[a];
		for(int i = 0; i<5; i++) {
			int A = sc.nextInt();
			arr[i] = A;
		}
		for(int w=0;w<4;w++) {
			
			if(w<2&&arr[w]<arr[w+1]) {
				bugger=arr[w];
			}
			else if(w<2&&arr[w]>arr[w+1]) {
				bugger=arr[w+1];
			}

			if(w>2&&arr[w]<arr[w+1]) {
				drink = arr[w];
			}
			else if(w>2&&arr[w]>arr[w+1]) {
				drink = arr[w+1];
			}
		}

		System.out.println(bugger+drink-50);
				
	}	
}



/*public class Bj_test1_buggerset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int bugger=2001, drink=2001;
		
		for(int i=0; i<3; i++) {
			int A = sc.nextInt();
			if(A<bugger) {
				bugger=A;
			}
		}
		
		for(int i = 0; i<2; i++) {
			int A =sc.nextInt();
			if(A<drink) {
				drink = A;
			}
		}

		System.out.println(bugger+drink-50);				
	}	
}*/
