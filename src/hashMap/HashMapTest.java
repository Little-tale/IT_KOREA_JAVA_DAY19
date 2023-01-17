package hashMap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args)
	{	HashMap<String, Integer> map = new HashMap<>();
	
		map.put("사과농장", 1);
		map.put("과자농장", 2);
		map.put("라면농장", 3);
		map.put("과자농장", 4);
		map.put("롯데농장", 5);
		map.put("배고픔농장", 6);
		
		System.out.println(map);
		System.out.println(map.put("엘지농장", 2));
		System.out.println(map.put("롯데농장", 10));
		System.out.println(map);
		
		System.out.println(map.get("롯데농장"));
		
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
