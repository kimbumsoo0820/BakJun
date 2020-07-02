package baekjun;
import java.io.*;
import java.util.StringTokenizer;

public class Bj_for_CaseTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		
		for (int i=0; i<n; i++) {
			String input = br.readLine();
			String [] word = input.split(" ");
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write("Case #"+(i+1)+":"+" "+a +" + "+b+" = "+(a+b)+ "\n");
		}
		bw.flush();
		bw.close();
		br.close();

	}

}
