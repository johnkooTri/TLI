package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		PersonInfo person = new PersonInfo();
		person.setAge(20);
		person.setName("hong gil dong");
		person.setSsn("12345678");
		
		OutputStream out = new FileOutputStream("c:\\aaa_out.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		oos.writeObject(person);
		
		oos.close();
		out.close();
		
	}

}
