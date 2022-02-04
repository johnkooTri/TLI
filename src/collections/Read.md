
# collections
�������� ���� ���¿� ���� �ڷᱸ�� ���

 - ����Ʈ(list) : ������ ������ ������ �ߺ��� ����ϴ� �������� (�ε����� �߿��� ������ �Ѵ�.)
 - ��Ʈ(Set):������ ������ �ʰ�, �������� �ߺ��� ������� �ʴ� ����
 - ��(Map):Ű�� ���� ������, Ű�� ������ ���ϴ� �����͸� �˻��ϴ� ����
## **getOrDefault**

#### **- ã�� Ű�� �����Ѵٸ� ã�� Ű�� ���� ��ȯ�ϰ� ���ٸ� �⺻ ���� ��ȯ�ϴ� �޼���**

#### **��� ���**

> **getOrDefault(**Object  key, V DefaultValue**)**

**�Ű� ���� :**  �� �޼���� �� ���� �Ű� ������ ����մϴ�.

-   **key :**  ���� �����;� �ϴ� ����� **Ű�Դϴ�.**
-   **defaultValue :**  ������ Ű�� ���ε� ���� ���� ��� ��ȯ�Ǿ��  �ϴ� **�⺻���Դϴ�.**

**��ȯ �� :** ã�� key�� �����ϸ� �ش� key�� ���εǾ� �ִ� ���� ��ȯ�ϰ�, �׷��� ������  **����Ʈ ����**  ��ȯ�˴ϴ�.
 
        String[] participant={"leo", "kiki", "eden"};
    	String[] completion={"eden", "kiki"};    	
    	
    	String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        //player �� �����ϸ� 1, �������� ������ ����Ʈ�� 0 
        
        for (String player : completion) hm.put(player, hm.get(player) - 1);
        //player �� �����ϸ� value �� -1