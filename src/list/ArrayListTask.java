package list;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
import java.util.Random;

public class ArrayListTask {

	public static void main(String[] args)
	{
		// 1~ 20 난수를 만들어 Array List 5개만 저장
		// 중복숫자는 없다.
		// 정렬 한다.
		
		Random rm = new Random();
		
		ArrayList<Integer> ALO = new ArrayList<>();
		
		int count = 1;
		int imsi = 0;
		
		
		while (count < 6)
		{
			
			
			imsi = rm.nextInt(20)+1;
			if(!ALO.contains(imsi))
			{
				ALO.add(imsi);
				continue;
			}
			
			++count; 
			
		}
		
		Collections.sort(ALO);
		System.out.println(ALO);
		

	}

}
