package final_test.test11_nation_capital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NationTestHashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashMap <String, String> nation = new HashMap<String, String>();
		ArrayList <String> al = new ArrayList<String>();
		nation.put("그리스", "아테네");
		nation.put("독일", "베를린");
		nation.put("스페인", "마드리드");
		nation.put("영국", "런던");
		nation.put("중국", "베이징");
		nation.put("미국", "워싱턴DC");
		nation.put("프랑스", "파리");
		nation.put("러시아", "모스크바");
		nation.put("일본", "도쿄");
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while (true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int select1 = sc.nextInt();
			switch (select1) {
			case 1 :

				System.out.println("현재 " + nation.size() + "개 나라와 수도가 입력되어 있습니다.");
				
				while (true) {
					System.out.print("나라와 수도 입력" + (nation.size() + 1) + ">> ");
					String country = sc.next();
					if (country.equals("그만"))
						break;
					String capital = sc.nextLine();
					if (nation.containsKey(country)) {
						System.out.println(country + "는 이미 있습니다!!");
						continue;
					}
					nation.put(country, capital);
				}
				break;
			case 2 :
				for (String s : nation.keySet()) {
					al.add(s);
				}
				while (true) {
					int randomIndex = (int)(Math.random()*nation.size());
					String randomCountry = al.get(randomIndex);
					String randomCapital = nation.get(al.get(randomIndex));
					System.out.print(randomCountry + "의 수도는? ");
					String answer = sc.next();
					if (answer.equals("그만"))
						break;
					else if (answer.equals(randomCapital))
						System.out.println("정답!!");
					else
						System.out.println("아닙니다!!");
				}
				break;
			case 3 :
				System.out.println("게임을 종료 합니다.");
				sc.close();
				return;
			}
	
		}
	}
}
