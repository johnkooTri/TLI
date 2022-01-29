## java.io 패키지

**I/O (Input/Output) 의미**
Input : 사용자가 프로그램에 데이터를 전달하는것, 예를 들어 키보드는 입력 장비
Output: 프로그램이 결과를 내보내는 것, System.out.println()은 화면에 결과를 내보내는 방식

**스트림(Stream):I/O 의 또 다른 이름**
I/O 에서는 데이터를 읽거나 쓰는 빨대(스토로)만 기억하면 된다.
읽어들이는 빨대에는 in =Read
데이터를 출력할때는 out =Write

**1byte 단위처리 				java.io.InpuStream /  java.io.OutputStream  => 이미지나 데이터 주고받을때
2byte(char) 단위처리    java.io.Reader  /  java.io.Writer                       => 문자열주고받을때사용**


**InputStream을 구하는 두가지 방법** 
1)InputStream을 클래스로부터 객체를 생성하는 방식을 이용하는것
2)어떤 객체의 메소드의 실행 결과고 InputStream 타입의 객체가 나오는 경우

 1. FileInputStream: 파일에서 데이터를 읽어들이는 기능을 가진 클래스 
 2. ZipInputStream: 압축포멧인   zip에서 읽어들이는 기능을 가진 클래스
 3. DataInputStream/BufferInputStream : 다양한 스타일의   데이터를 읽어들이는 InputStream
 4. 
 ## InputStream에서 반드시 기억해야 하는 메소드 read(): 한바이트의 데이터를 읽는다.
**InputStream 응 이용해서 코드 작성 순서**
 
 1. 원하는 대상에서 데이터를 읽어낼 수 있는 InputStream 계열의 객체를 구해냅니다.
 2. read() 메소드를 이용해서 데이터를 읽어냅니다.




   

**InputStream의 read() 메소드는 빨대에서 한 바이트를 빨아내서 그 결과를 int 타입으로 반환합니다.
이때의 int 결과를 숫자로 보지 말고, 한 바이트의 데이터값으로만 생각해야 합니다.**

     public abstract int read()
        throws IOException

**read(byte[])메소드는 한 번에 byte[]만큼씩 데이터를 읽어 냅니다. byte[] 안으로 새로이 읽혀 들어간 바이트의 수를 의미 즉, 새로운 데이터 몇 개가 byte[]로 들어갔는지를 의미하는 숫자** 

     public int read(byte[] b)
        throws IOException

