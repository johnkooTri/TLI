package github.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputEx {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		InputStream in 
			= new FileInputStream("C:\\aaa.txt");
		
		while(true) {
			//�ѹ���Ʈ�� �о���� ���
			int data = in.read();
			System.out.println(data);
			
			if(data==-1) {
				break;
			}
			
		}

	}

}
