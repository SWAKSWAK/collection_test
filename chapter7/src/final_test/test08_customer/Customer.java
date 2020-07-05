package final_test.test08_customer;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		HashMap<String, Integer> customerInfo = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("***����Ʈ ���� ���α׷� �Դϴ�.***");
		while (true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			String name = sc.next();
			if (name.equals("�׸�")) {
				sc.close();
				return;
			}
			int point = sc.nextInt();
			
			if (customerInfo.get(name) != null)
				customerInfo.put(name, customerInfo.get(name) + point);
			else
				customerInfo.put(name, point);
			
			viewPoint(customerInfo);
		}
	}

	static void viewPoint(HashMap<String, Integer> customerInfo) {
		for (String key : customerInfo.keySet()) {
			System.out.print("(" + key + "," + customerInfo.get(key) + ")");
		}
		System.out.println();
	}
}
