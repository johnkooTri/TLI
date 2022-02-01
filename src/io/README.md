
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


## OutputStream: 바이트의 데이터를 기록할 수 있다.
write(int)방식은 한번에 파라미터로 들어오는 한 바이트에 해당하는 데이터만 넣어준다.

    public abstract void write(int b)
    throws IOException

**write(byte[])은 파라미터로 입력된 데이터를 한번에 원하는 대상으로 데이터를 출력
write(byte[],int,int)는 byte[]안에 있는 데이터를 원하는 위치에서부터 원하는 숫자만큼 데이터를 기록해줍니다.**

    public void write(byte[] b,int off,int len)

**flush()를 통해서 스트림에 기록된 데이터를 확실히 보낼 수 있다.**


**

## DataInputStream, DataOutputStream

**

    public class DataOutputEx {
    
    	public static void main(String[] args) throws IOException {
    		// TODO Auto-generated method stub
    
    		String str="이 문자열을 기록해 볼까 합니다.";
    		
    		OutputStream out = new FileOutputStream("c:\\aaa.txt");
    		DataOutputStream dos = new DataOutputStream(out);
    		dos.writeUTF(str);
    		
    //		연결을 종료할 떄는 연결된 순서의 역순으로 종료
    		dos.close();
    		out.close();
    		
    	}
    
    }

DataOutputStream 으로 데이터를 저장할때 UTF-8 방식으로 데이터가 저장된다.
영어나 문자(한글,중국어)의 처리방법이 다르다.
영문은 한바이트 기록
한글은 3바이트 기록하고 데이터를 기록하기 전에 2byte의 정보를 이용하여 데이터가 어떻게 처리될 것인가를 미리 표시한다.

**DataOutputStream으로 출력된 데이터는 반드시 DataInputStream 을 통해서 읽어야만 한다.**

**Writer 메소드중에는 문자열 자체를 기록하는 메소드가 있으나 Reader에는 문자열로 읽어내는 기능이 없다.**
**BufferReader 클래스는 문자열로 데이터를 읽어내는 기능을 가지고 있다.**

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


**객체를 읽거나 쓸 수 있는 ObjectInputStream , ObjectOutputStream
확장스트림(=혼자서 객체가 만들어질 수 있는것이 아니라 어떤 OutputStream 계열에 추가로 연결하는 Stream)**

    ObjectOutputStream()
    ObjectOutputStream(OutputStream out)	


어떤 객체의 정보를 뽑아서 저장하려면 Serializable 이라는 인터페이스를 구현한다.
객체의 정보가 일정한 법칙에 따라서 저장된다.(=객체의 직렬화)