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

