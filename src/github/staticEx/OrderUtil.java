package github.staticEx;

public class OrderUtil {

	private static int count=0;
	
	public void pressButton() {
		
		count++;
		System.out.println("������ ��ȣ�� :"+count+"�Դϴ�.");
		
	}
	
	public static void main(String[] args) {
		
		OrderUtil u1 = new OrderUtil();
		OrderUtil u2 = new OrderUtil();
		
		u1.pressButton();
		u2.pressButton();
		
	}
	
	
	
}
