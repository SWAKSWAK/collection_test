package final_test.test10_shape;

import java.util.Scanner;
import java.util.Vector;

public class GraphicEditor {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("�׷��� ������ beauty�� ���� �մϴ�.");

		Vector<Shape> shape = new Vector<Shape>();

		while (true) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			int select1 = sc.nextInt();

			switch (select1) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int select2 = sc.nextInt();
				switch (select2) {
				case 1:
					shape.add(new Line());
					shape.get(shape.size() - 1).draw();
					break;
				case 2:
					shape.add(new Rect());
					shape.get(shape.size() - 1).draw();
					break;
				case 3:
					shape.add(new Circle());
					shape.get(shape.size() - 1).draw();
					break;
				}
				break;
			case 2:
				System.out.print("������ ������ ��ġ>>");
				select2 = sc.nextInt();
				System.out.println("������ �� �����ϴ�.");
				break;
			case 3:
				for (int i = 0; i < shape.size(); i++)
					shape.get(i).draw();
				System.out.print(" ");
				break;
			case 4:
				System.out.println("beauty�� �����մϴ�.");
				sc.close();
				return;
			}
		}
	}
}
