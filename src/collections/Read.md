
# collections
데이터의 저장 형태에 따른 자료구조 용어

 - 리스트(list) : 순서를 가지고 있으며 중복을 허용하는 보관구조 (인덱스가 중요한 역할을 한다.)
 - 세트(Set):순서를 가지지 않고, 데이터의 중복을 허용하지 않는 구조
 - 맵(Map):키와 값을 가지며, 키를 가지고 원하는 데이터를 검색하는 구조
## **getOrDefault**

#### **- 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드**

#### **사용 방법**

> **getOrDefault(**Object  key, V DefaultValue**)**

**매개 변수 :**  이 메서드는 두 개의 매개 변수를 허용합니다.

-   **key :**  값을 가져와야 하는 요소의 **키입니다.**
-   **defaultValue :**  지정된 키로 매핑된 값이 없는 경우 반환되어야  하는 **기본값입니다.**

**반환 값 :** 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면  **디폴트 값이**  반환됩니다.
 
        String[] participant={"leo", "kiki", "eden"};
    	String[] completion={"eden", "kiki"};    	
    	
    	String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        //player 가 존재하면 1, 존재하지 않으면 디폴트값 0 
        
        for (String player : completion) hm.put(player, hm.get(player) - 1);
        //player 가 존재하면 value 값 -1