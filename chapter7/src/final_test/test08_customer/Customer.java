package final_test.test08_customer;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		HashMap<String, Integer> customerInfo = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("***포인트 관리 프로그램 입니다.***");
		while (true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = sc.next();
			if (name.equals("그만")) {
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
