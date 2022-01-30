package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream in = null;
	    OutputStream out = null;
	    
	    try {
	    	
	    	in = new FileInputStream("c:\\aaa.txt");
	    	out = new FileOutputStream("c:\\aaa_out.txt");
	    	
//	    	데이터를 한번에 읽기위한 공간
	    	byte[] arr = new byte[5];
	    	
	    	while (true) {
	    		int count = in.read(arr);
	    		if(count==-1) {
	    			break;
	    		}
	    		
	    		out.write(arr,0,count);
			}
	    	
	    	
	    }catch(Exception e) {
	    	
	    	e.printStackTrace();
	    	
	    }finally {
	    	
	    	if(in != null) {
	    		try {
	    			in.close();
	    		}catch(Exception e){ 
	    			
	    		}
	    	}
	    	
	    	if(out != null) {
	    		try {
	    			out.close();
	    		}catch(Exception e){
	    			
	    		}
	    	}
	    	
	    }
		
		
	}

}
