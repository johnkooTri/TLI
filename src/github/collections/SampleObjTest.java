package github.collections;
import java.util.ArrayList;

public class SampleObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleObj obj1 = new SampleObj("��ü1");
		SampleObj obj2 = new SampleObj("��ü2");
		SampleObj obj3 = new SampleObj("��ü3");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		

		ArrayList<SampleObj> list = new ArrayList<SampleObj>();
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		System.out.println(list);
		
		
		SampleObj target = new SampleObj("��ü3");
		
		int index = list.indexOf(target);
		
		System.out.println("���ϴ� ��ü�� ��ġ�� :"+index);
		//arrayList �ȿ� �ִ� ��ü�� target �� �����ٸ� ��ü�̴�.
//		���� �ٸ� �������� �ּҸ� ������.
		
//		���������� �����ٸ� ��ü���� �������� ���� ������ָ� �˾Ƽ� ArrayList�� �˻��� ��� ���ش�.
		
		
		
		
	}

}
