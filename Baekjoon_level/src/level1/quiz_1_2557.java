package level1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class quiz_1_2557 {
	public static void main(String[] args) throws IOException {
		
		// try catch 문 사용
//		try (
//				OutputStreamWriter ow = new OutputStreamWriter(System.out);
//				BufferedWriter bw = new BufferedWriter(ow);
//		) {
//			bw.write("Hello World!");
//			bw.flush();
//			bw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		bw.write("Hello World!");
		bw.flush();
		bw.close();
			
	}
}
