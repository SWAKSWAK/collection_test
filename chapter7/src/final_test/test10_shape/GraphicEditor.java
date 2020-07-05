package final_test.test10_shape;

import java.util.Scanner;
import java.util.Vector;

public class GraphicEditor {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("그래픽 에디터 beauty를 실행 합니다.");

		Vector<Shape> shape = new Vector<Shape>();

		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
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
				System.out.print("삭제할 도형의 위치>>");
				select2 = sc.nextInt();
				System.out.println("삭제할 수 없습니다.");
				break;
			case 3:
				for (int i = 0; i < shape.size(); i++)
					shape.get(i).draw();
				System.out.print(" ");
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
}
