package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectReadTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		InputStream in = new FileInputStream("c:\\aaa_out.txt");
		
		ObjectInputStream oin = new ObjectInputStream(in);

		Object obj = oin.readObject();
		PersonInfo person = (PersonInfo) obj;

		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getSsn());
		
		oin.close();
		in.close();
		
	}

}
