package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataOutputEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String str="�� ���ڿ��� ����� ���� �մϴ�.";
		
		OutputStream out = new FileOutputStream("c:\\aaa.txt");
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(str);
		
//		������ ������ ���� ����� ������ �������� ����
		dos.close();
		out.close();
		
	}

}
