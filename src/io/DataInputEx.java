package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream in = new FileInputStream("c:\\aaa.txt");
		DataInputStream dis = new DataInputStream(in);
		
		String str = dis.readUTF();
		
		System.out.println(str);
		
		dis.close();
		in.close();
	}

}
