## **static �̶�� Ư���� �ǹ�**

��簴ü�� ������ �����͸� �����ؾ� �� �ʿ䰡 �ִ�.
��簴ü�� �����Ϳ� ������ �� �� �ִ�.

Static �̶�� �ǹ̴� '������,�������� �ʴ´�'
�޸𸮿��� �����Ǳ� ������ ���� �̸�������, �������� ������ �ҽ����� static �� ����Ѵٴ� �ǹ̴� ��� ��ü�� '����'�Ѵٴ� �ǹ�

static�� ���� ������ Ŭ���� ������� �Ѵ�.
static�� ���� ������ ��ü�� ������(���۷���)�� �̿��ؼ� ����ϴ� �Ϲ����� ��ü���� ���α׷��ְ��� �޸� Ŭ������ �����̱⶧���� �׳� '�̸�.Ŭ����' ������� ������� ����ϰ� �˴ϴ�.

��ü�ǿ����� ���� �ʱ� ������ static�� ���� ��ü�� ���ؼ� ����� ������ �����ϴ�.

    public class AreaEx {
    	public static double calcCircle(double radius) {
    		return (radius * radius) * Math.PI;
    	}
    }

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

�ٷ� AreaEx.calcCircle() �޼ҵ带 Ȱ��
static�� ��ü���� �ٸ������͸� ������ �����ϴ°��� ���� �Ϻ��ϰ� �����ϰ� �����ϴ� ���� �����ϱ� ���ؼ� ����ϱ� ������ ���� ��ü�� ����ؾ� �ϴ� ������ �����Ƿ� �ٷ� **Ŭ�����̸�.����** �Ǵ� **Ŭ�����̸�.�޼ҵ�** ���

Area ex = new AreaEx();
double area = ex.calcCircle(r);
**'���� static�� �޼ҵ带 ��ü�� ���ؼ� ����� �ʿ䰡 ����.'**

## static�� �ӵ��� ��������, �޸𸮰� ȸ������ �ʱ� ������ �����ؾ��Ѵ�.
������ �÷��ǿ� ����� �ƴϴ�.



## static�� ���
static�� Ŭ���� ������ ��ü�� ������� �����Ǵ� �������̰�, ������ ��ü ���� ���̵� ������� ����� �� �ֱ� ������ �ܺο��� ������ ����ϴ� �����͸� �����ϱ⵵ �Ѵ�.

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

