package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {

	public static void main(String[] args) {
		// 카페 메뉴 만들기
		HashMap<String, Integer> cafeMenu = new HashMap<>();
		cafeMenu.put("아메리카노", 2500);
		cafeMenu.put("라떼", 3500);
		cafeMenu.put("모카", 4500);
		cafeMenu.put("바닐라라떼", 4500);
		
		
		System.out.println("1.아메리카노 \n2.라떼 \n3. 모카\n4. 바닐라라떼");
		Scanner sc = new Scanner(System.in);
		int userCh = 9;
		
		userCh = sc.nextInt();
		
		switch (userCh){
		case 1: {
			cafeMenu.get("아메리카노");
			System.out.println(cafeMenu.get("아메리카노") + "원 입니다.");
			break;
		}case 2:{
			cafeMenu.get("라떼");
			System.out.println(cafeMenu.get("라떼") + "원 입니다.");}
		break;
		case 3 :{
			cafeMenu.get("모카");
			System.out.println(cafeMenu.get("모카") + "원 입니다.");
			break;
		}case 4 :
		{
			cafeMenu.get("바닐라라떼");
			System.out.println(cafeMenu.get("바닐라라떼") + "원 입니다.");
			break;
		}
		default:
			System.out.println("오버 값.");
			throw new IllegalArgumentException("Unexpected value: " + userCh);
		}
		
		
		
		
		

	}

}
