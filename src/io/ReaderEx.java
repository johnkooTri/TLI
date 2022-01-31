package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Reader reader = new FileReader("c:\\aaa.txt");

		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			
			
			String str = br.readLine();
			
			if(str==null) {
				break;
			}
			
			System.out.println(str);
		}
		
		br.close();
		reader.close();
		
	}

}
