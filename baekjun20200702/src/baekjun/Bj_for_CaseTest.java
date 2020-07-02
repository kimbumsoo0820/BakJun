package baekjun;
import java.util.Scanner;

public class Bj_for_CaseTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int []arr = new int[A];
		for(int i=0; i<A; i++) {
			
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			arr[i]=B+C;
			System.out.println("Case #"+(i+1)+":"+" "+arr[i]);
		}
		
	}

}

/*import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ApB7_11021 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bf.readLine());
        int A = 0, B = 0;

        for (int i = 0; i < num ; i++) {
            StringTokenizer st = new StringTokenizer((bf.readLine()));
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            bw.write("Case #"+ (i+1) + ": " + (A+B) + "\n");

        }
        bw.flush();
    }
}*/