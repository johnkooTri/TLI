
## java.io ��Ű��

**I/O (Input/Output) �ǹ�**
Input : ����ڰ� ���α׷��� �����͸� �����ϴ°�, ���� ��� Ű����� �Է� ���
Output: ���α׷��� ����� �������� ��, System.out.println()�� ȭ�鿡 ����� �������� ���

**��Ʈ��(Stream):I/O �� �� �ٸ� �̸�**
I/O ������ �����͸� �аų� ���� ����(�����)�� ����ϸ� �ȴ�.
�о���̴� ���뿡�� in =Read
�����͸� ����Ҷ��� out =Write

**1byte ����ó�� 				java.io.InpuStream /  java.io.OutputStream  => �̹����� ������ �ְ������
2byte(char) ����ó��    java.io.Reader  /  java.io.Writer                       => ���ڿ��ְ���������**


**InputStream�� ���ϴ� �ΰ��� ���** 
1)InputStream�� Ŭ�����κ��� ��ü�� �����ϴ� ����� �̿��ϴ°�
2)� ��ü�� �޼ҵ��� ���� ����� InputStream Ÿ���� ��ü�� ������ ���

 1. FileInputStream: ���Ͽ��� �����͸� �о���̴� ����� ���� Ŭ���� 
 2. ZipInputStream: ����������   zip���� �о���̴� ����� ���� Ŭ����
 3. DataInputStream/BufferInputStream : �پ��� ��Ÿ����   �����͸� �о���̴� InputStream
 4. 
 ## InputStream���� �ݵ�� ����ؾ� �ϴ� �޼ҵ� read(): �ѹ���Ʈ�� �����͸� �д´�.
**InputStream �� �̿��ؼ� �ڵ� �ۼ� ����**
 
 1. ���ϴ� ��󿡼� �����͸� �о �� �ִ� InputStream �迭�� ��ü�� ���س��ϴ�.
 2. read() �޼ҵ带 �̿��ؼ� �����͸� �о���ϴ�.




   

**InputStream�� read() �޼ҵ�� ���뿡�� �� ����Ʈ�� ���Ƴ��� �� ����� int Ÿ������ ��ȯ�մϴ�.
�̶��� int ����� ���ڷ� ���� ����, �� ����Ʈ�� �����Ͱ����θ� �����ؾ� �մϴ�.**

     public abstract int read()
        throws IOException

**read(byte[])�޼ҵ�� �� ���� byte[]��ŭ�� �����͸� �о� ���ϴ�. byte[] ������ ������ ���� �� ����Ʈ�� ���� �ǹ� ��, ���ο� ������ �� ���� byte[]�� �������� �ǹ��ϴ� ����** 

     public int read(byte[] b)
        throws IOException


## OutputStream: ����Ʈ�� �����͸� ����� �� �ִ�.
write(int)����� �ѹ��� �Ķ���ͷ� ������ �� ����Ʈ�� �ش��ϴ� �����͸� �־��ش�.

    public abstract void write(int b)
    throws IOException

**write(byte[])�� �Ķ���ͷ� �Էµ� �����͸� �ѹ��� ���ϴ� ������� �����͸� ���
write(byte[],int,int)�� byte[]�ȿ� �ִ� �����͸� ���ϴ� ��ġ�������� ���ϴ� ���ڸ�ŭ �����͸� ������ݴϴ�.**

    public void write(byte[] b,int off,int len)

**flush()�� ���ؼ� ��Ʈ���� ��ϵ� �����͸� Ȯ���� ���� �� �ִ�.**


**

## DataInputStream, DataOutputStream

**

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

DataOutputStream ���� �����͸� �����Ҷ� UTF-8 ������� �����Ͱ� ����ȴ�.
��� ����(�ѱ�,�߱���)�� ó������� �ٸ���.
������ �ѹ���Ʈ ���
�ѱ��� 3����Ʈ ����ϰ� �����͸� ����ϱ� ���� 2byte�� ������ �̿��Ͽ� �����Ͱ� ��� ó���� ���ΰ��� �̸� ǥ���Ѵ�.

**DataOutputStream���� ��µ� �����ʹ� �ݵ�� DataInputStream �� ���ؼ� �о�߸� �Ѵ�.**

**Writer �޼ҵ��߿��� ���ڿ� ��ü�� ����ϴ� �޼ҵ尡 ������ Reader���� ���ڿ��� �о�� ����� ����.**
**BufferReader Ŭ������ ���ڿ��� �����͸� �о�� ����� ������ �ִ�.**

    BufferedReader(Reader in)
    BufferedReader(Reader in,int sz)

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


**��ü�� �аų� �� �� �ִ� ObjectInputStream , ObjectOutputStream
Ȯ�彺Ʈ��(=ȥ�ڼ� ��ü�� ������� �� �ִ°��� �ƴ϶� � OutputStream �迭�� �߰��� �����ϴ� Stream)**

    ObjectOutputStream()
    ObjectOutputStream(OutputStream out)	


� ��ü�� ������ �̾Ƽ� �����Ϸ��� Serializable �̶�� �������̽��� �����Ѵ�.
��ü�� ������ ������ ��Ģ�� ���� ����ȴ�.(=��ü�� ����ȭ)