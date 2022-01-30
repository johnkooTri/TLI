package github.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class FileCopy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		읽어들일 수 있는 스트림과 출력 가능한 스트림을 준비한다.
		InputStream in = null;
		OutputStream out = null;
		
		try {
			
			in  = new FileInputStream("C:\\aaa.txt");
			out = new FileOutputStream("C:\\aaa_out.txt");
			
			byte[] arr = new byte[5];
			
			while(true) {
				int data = in.read(arr);
				if(data == -1) {
					break;
				}
				out.write(arr);
			}//end while
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			if(in != null) {
				try {
					in.close();
				}catch(Exception e) {
					
				}
				
			}
			
			if(out != null) {
				try {
					out.close();
				}catch(Exception e) {
					
				}
				
			}			
			
		}
		
	}

}
