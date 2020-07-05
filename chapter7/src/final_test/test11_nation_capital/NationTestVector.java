package final_test.test11_nation_capital;

import java.util.Scanner;
import java.util.Vector;

public class NationTestVector {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Nation> nv = new Vector<Nation>();
		nv.add(new Nation("�׸���", "���׳�"));
		nv.add(new Nation("����", "������"));
		nv.add(new Nation("������", "���帮��"));
		nv.add(new Nation("����", "����"));
		nv.add(new Nation("�߱�", "����¡"));
		nv.add(new Nation("�̱�", "������DC"));
		nv.add(new Nation("������", "�ĸ�"));
		nv.add(new Nation("���þ�", "��ũ��"));
		nv.add(new Nation("�Ϻ�", "����"));

		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int select1 = sc.nextInt();
			switch (select1) {
			case 1:

				System.out.println("���� " + nv.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				label: while (true) {
					System.out.print("����� ���� �Է�" + (nv.size() + 1) + ">> ");
					String country = sc.next();
					if (country.equals("�׸�"))
						break;
					String capital = sc.next();
					for (int i = 0; i < nv.size(); i++) {
						if (country.equals(nv.get(i).getCountry())) {
							System.out.println(country + "�� �̹� �ֽ��ϴ�!!");
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
				System.out.print(randomCountry + "�� ������??");
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
