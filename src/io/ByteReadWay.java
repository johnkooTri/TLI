package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ByteReadWay {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream in = new FileInputStream("c:\\aaa.txt");
		
		Scanner scanner = new Scanner(in);
		
		while(true) {
			
			try {
			
				String str = scanner.nextLine();
				System.out.println(str);
			}catch(Exception e) {
				break;
			}
			
			
			in.close();
			
		}
		
		
	}

}
