package staticEx;

import java.util.Scanner;

public class AreaUI {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력해 주세요");
		
		double r = sc.nextDouble();
		double area = AreaEx.calcCircle(r);
		
		System.out.println("넓이는 :"+area);
	}

}
