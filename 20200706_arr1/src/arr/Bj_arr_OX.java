package arr;
import java.util.Scanner;
public class Bj_arr_OX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int [] result = new int[A];
		
		sc.nextLine(); // �����ִ� ���͸� ����� ����
		
		for(int i=0; i<A; i++) {
			String tmp = sc.nextLine();
			int score = 0;
			
			for(int j=0; j<tmp.length(); j++) {
				if(tmp.charAt(j)=='O') {
					score++;
					result[i] = result[i]+score;
				}
				else {
					score =0;
				}
			}
		}
		for(int i=0; i<A; i++) {
			System.out.println(result[i]);
		}
		sc.close();
		

	}

}
