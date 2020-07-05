package final_test.test11_nation_capital;

import java.util.Scanner;
import java.util.Vector;

public class NationTestVector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Nation> nv = new Vector<Nation>();
		nv.add(new Nation("그리스", "아테네"));
		nv.add(new Nation("독일", "베를린"));
		nv.add(new Nation("스페인", "마드리드"));
		nv.add(new Nation("영국", "런던"));
		nv.add(new Nation("중국", "베이징"));
		nv.add(new Nation("미국", "워싱턴DC"));
		nv.add(new Nation("프랑스", "파리"));
		nv.add(new Nation("러시아", "모스크바"));
		nv.add(new Nation("일본", "도쿄"));

		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while (true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int select1 = sc.nextInt();
			switch (select1) {
			case 1:

				System.out.println("현재 " + nv.size() + "개 나라와 수도가 입력되어 있습니다.");
				label: while (true) {
					System.out.print("나라와 수도 입력" + (nv.size() + 1) + ">> ");
					String country = sc.next();
					if (country.equals("그만"))
						break;
					String capital = sc.next();
					for (int i = 0; i < nv.size(); i++) {
						if (country.equals(nv.get(i).getCountry())) {
							System.out.println(country + "는 이미 있습니다!!");
							continue label;
						}
					}
					nv.add(new Nation(country, capital));
				}
				break;
			case 2 :
				while (true) {
				int ranVal = (int) (Math.random() * nv.size());
				String randomCountry = nv.get(ranVal).getCountry();
				String randomCapital = nv.get(ranVal).getCapital();
				System.out.print(randomCountry + "의 수도는??");
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
