package final_test.test03_population;

import java.util.HashMap;
import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashMap<String, Integer> nationPop = new HashMap<String, Integer>();
		
		System.out.println("나라 이름과 인구를 입력하세요 (예: Korea 5000)");
		while (true) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = sc.next();
			if (nation.equals("그만")) {
				break;
			}
			int population = sc.nextInt();
			nationPop.put(nation, population);
		}
		while (true) {
			System.out.print("인구 검색 >> ");
			String nation = sc.next();
			if (nation.equals("그만")){
				sc.close();
				return;
			}else if (nationPop.get(nation) == null) {
				System.out.println(nation + " 나라는 없습니다.");
				continue;
			}
			int population = nationPop.get(nation);
			System.out.println(nation + "의 인구는 " + population + "만명");
		}
	}
}
