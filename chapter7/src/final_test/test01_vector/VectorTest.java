package final_test.test01_vector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("정수 (-1이 입력될 때까지)");
		while (true) {
			int input = sc.nextInt();
			if (input == -1) {
				Collections.sort(v);
				Collections.reverse(v);
				System.out.println("가장 큰 수는 " + v.get(0));
				sc.close();
				break;
			}
			v.add(input);
		}
	}
}
