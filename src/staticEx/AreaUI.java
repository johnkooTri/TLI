package staticEx;

import java.util.Scanner;

public class AreaUI {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��� �ּ���");
		
		double r = sc.nextDouble();
		double area = AreaEx.calcCircle(r);
		
		System.out.println("���̴� :"+area);
	}

}
