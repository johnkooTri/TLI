## 접근제한 의미

 - public : 모든 외부에서 직접 접근하거나 호출 가능
 - protected:현재클래스와 동일클래스이거나 상속시에 접근가능
 -  default : 현재클래스와 동일패키지내에서만 접근가능
 - private:현재클래스의 {} 바깥쪽에서는 절대로 보이지 않음

## **static 이라는 특별한 의미**

모든객체가 동일한 데이터를 참고해야 할 필요가 있다.
모든객체는 데이터에 영향을 줄 수 있다.

Static 이라는 의미는 '정적인,움직이지 않는다'
메모리에서 고정되기 때문에 붙은 이름이지만, 여러분이 실제로 소스에서 static 을 사용한다는 의미는 모든 객체가 '공유'한다는 의미

static이 붙은 변수는 클래스 변수라고 한다.
static이 붙은 변수는 객체의 리모컨(레퍼런스)를 이용해서 사용하는 일반적인 객체지향 프로그래밍과는 달리 클래스의 변수이기때문에 그냥 '이름.클래스' 변수라는 방식으로 사용하게 됩니다.

객체의영향을 받지 않기 때문에 static은 굳이 객체를 통해서 사용할 이유가 없습니다. 

    public class AreaEx {
    	public static double calcCircle(double radius) {
    		return (radius * radius) * Math.PI;
    	}
    }

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

바로 AreaEx.calcCircle() 메소드를 활용
static은 객체마다 다른데이터를 가지고 동작하는것을 막고 완벽하게 동일하게 동작하는 것을 보장하기 위해서 사용하기 때문에 굳이 객체를 사용해야 하는 이유가 없으므로 바로 **클래스이름.변수** 또는 **클래스이름.메소드** 사용

Area ex = new AreaEx();
double area = ex.calcCircle(r);
**'굳이 static한 메소드를 객체를 통해서 사용할 필요가 없다.'**

## static은 속도는 빠르지만, 메모리가 회수되지 않기 때문에 주의해야한다.
가비지 컬렉션에 대상이 아니다.



## static과 상수
static은 클래스 변수로 객체의 상관없이 유지되는 데이터이고, 별도의 객체 생성 없이도 마음대로 사용할 수 있기 때문에 외부에서 누구나 사용하는 데이터를 정의하기도 한다.

    public class CostEx {
    
    public static final int RECTANGLE=1;
    public static final int TRIANGLE=2;
    
    public double getArea (int type, int width, int height ) {
     double area =0.0;
     
     if (type== RECTANGLE){
      area= width * height ;
    }else{
    }
    return area;
    
    }

