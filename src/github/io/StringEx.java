package github.io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputStream out = null;
		
		try {
		
			out = new FileOutputStream("C:\\aaa.txt");
		
			String str="이 문자열을 파일에 기록하고 싶습니다.";
			
			byte[] arr = str.getBytes();
		
			out.write(arr);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			if(out!=null) {
				try {
					out.close();
				}catch(Exception e) {
					
				}
				
			}
			
		}
		
	}

}
