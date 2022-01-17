package github.collections;
import java.util.ArrayList;

public class SampleObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleObj obj1 = new SampleObj("객체1");
		SampleObj obj2 = new SampleObj("객체2");
		SampleObj obj3 = new SampleObj("객체3");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		

		ArrayList<SampleObj> list = new ArrayList<SampleObj>();
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		
		System.out.println(list);
		
		
		SampleObj target = new SampleObj("객체3");
		
		int index = list.indexOf(target);
		
		System.out.println("원하는 객체의 위치는 :"+index);
		//arrayList 안에 있는 객체와 target 은 전혀다른 객체이다.
//		전혀 다른 물리적인 주소를 가진다.
		
//		물리적으로 전혀다른 객체지만 논리적으로 같게 만들어주면 알아서 ArrayList가 검색을 대신 해준다.
		
		
		
		
	}

}
