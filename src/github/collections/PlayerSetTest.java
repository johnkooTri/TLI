package github.collections;

import java.util.HashSet;

public class PlayerSetTest {

	
	public static void main(String[] args) {
		
		HashSet<Player> playerSet = new HashSet<>();
		
		playerSet.add(new Player("������","�ѱ�"));
		playerSet.add(new Player("�ֿ��","�ѱ�"));
		playerSet.add(new Player("����","������"));
		
		Player p = new Player("����","������");
		playerSet.remove(p);
		
		System.out.println(playerSet); // ������ �������� �ʾҴ�.
		
		
		
	}
		
	
	
}
