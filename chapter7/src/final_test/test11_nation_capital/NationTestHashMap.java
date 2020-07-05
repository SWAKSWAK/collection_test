package final_test.test11_nation_capital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NationTestHashMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashMap <String, String> nation = new HashMap<String, String>();
		ArrayList <String> al = new ArrayList<String>();
		nation.put("�׸���", "���׳�");
		nation.put("����", "������");
		nation.put("������", "���帮��");
		nation.put("����", "����");
		nation.put("�߱�", "����¡");
		nation.put("�̱�", "������DC");
		nation.put("������", "�ĸ�");
		nation.put("���þ�", "��ũ��");
		nation.put("�Ϻ�", "����");
		
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int select1 = sc.nextInt();
			switch (select1) {
			case 1 :

				System.out.println("���� " + nation.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				
				while (true) {
					System.out.print("����� ���� �Է�" + (nation.size() + 1) + ">> ");
					String country = sc.next();
					if (country.equals("�׸�"))
						break;
					String capital = sc.nextLine();
					if (nation.containsKey(country)) {
						System.out.println(country + "�� �̹� �ֽ��ϴ�!!");
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
					System.out.print(randomCountry + "�� ������? ");
					String answer = sc.next();
					if (answer.equals("�׸�"))
						break;
					else if (answer.equals(randomCapital))
						System.out.println("����!!");
					else
						System.out.println("�ƴմϴ�!!");
				}
				break;
			case 3 :
				System.out.println("������ ���� �մϴ�.");
				sc.close();
				return;
			}
	
		}
	}
}
