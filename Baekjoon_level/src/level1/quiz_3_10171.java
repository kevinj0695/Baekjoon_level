package level1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class quiz_3_10171 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\\n");
		bw.write(" )  ( ')\n");
		bw.write("(  /  )\n");
		bw.write(" \\(__)|\n");
		
		bw.flush();
		bw.close();
	}
}
