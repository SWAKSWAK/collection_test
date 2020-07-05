package final_test.test04_rainfall;

import java.util.Scanner;
import java.util.Vector;

public class Rainfall {
	public static void main(String[] args) {
		Vector<Integer> rainfall = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int avg;
		
		while (true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			int rainfallInt = sc.nextInt();
			if (rainfallInt == 0) {
				sc.close();
				return;
			}
			rainfall.add(rainfallInt);
			for (int i : rainfall)
				System.out.print(i + " ");
			sum += rainfallInt;
			avg = sum/rainfall.size();
			System.out.println("\n현재 평균 " + avg);
		}
	}
}
