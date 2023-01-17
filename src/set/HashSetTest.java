package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args)
	{	// 해쉬셋은 중복값을 허용하지 않음
		// 순서대로 저장되지 않음
		HashSet<String> animalSet = new HashSet<>();
		
		animalSet.add("코알라");
		animalSet.add("원숭이");
		animalSet.add("코알라");
		animalSet.add("기린");
		animalSet.add("치타");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("기린");
		
		
		System.out.println(animalSet);
		
		// 특정값을 가져올수 있나?
			//결론 - 안된다.
		//animalSet.toString("기린");

		//다른 자료 구조 변환해서 할수 있는가? 캐스팅
		
		Iterator<String> animalIter = animalSet.iterator();
		
		// 
		System.out.println(animalIter.hasNext());
		
		System.out.println(animalIter.next());
		
		
		
	}

}
