package final_test.test03_population;

import java.util.HashMap;
import java.util.Scanner;

public class Population {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		HashMap<String, Integer> nationPop = new HashMap<String, Integer>();
		
		System.out.println("���� �̸��� �α��� �Է��ϼ��� (��: Korea 5000)");
		while (true) {
			System.out.print("���� �̸�, �α� >> ");
			String nation = sc.next();
			if (nation.equals("�׸�")) {
				break;
			}
			int population = sc.nextInt();
			nationPop.put(nation, population);
		}
		while (true) {
			System.out.print("�α� �˻� >> ");
			String nation = sc.next();
			if (nation.equals("�׸�")){
				sc.close();
				return;
			}else if (nationPop.get(nation) == null) {
				System.out.println(nation + " ����� �����ϴ�.");
				continue;
			}
			int population = nationPop.get(nation);
			System.out.println(nation + "�� �α��� " + population + "����");
		}
	}
}
