package final_test.test07scholarship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Scholarship {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		HashMap <String, Double> nameGrade = new HashMap<String, Double>();//학생정보
		ArrayList<String> sName = new ArrayList<String>();//장학생명단
		
		System.out.println("미래 장학금 관리 시스템 입니다.");
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print("이름과 학점>>");
			nameGrade.put(sc.next(), sc.nextDouble());//학생정보입력
		}
		System.out.print("장학생 선발 학점 기준 입력>>");
		double standard = sc.nextDouble();//기준
		for(String name : nameGrade.keySet()) {
			if (nameGrade.get(name) > standard)//기준보다크면 
				sName.add(name);//장학생명단에 추가
		}
		System.out.print("장학생 명단 : ");
		for (String name : sName)
			System.out.print(name + " ");//장학생명단 출력
		sc.close();
	}
}
