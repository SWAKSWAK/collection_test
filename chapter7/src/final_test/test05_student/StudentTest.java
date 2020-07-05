package final_test.test05_student;

/*
 Ȳ����, �����, 1, 4.1
���繮, �ȵ���̵�, 2, 3.9
�賲��, ������, 3, 3.5
������, ������, 4, 4.25
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();

		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			String sInfo = sc.nextLine();
			StringTokenizer st = new StringTokenizer(sInfo, ", ");

			String name = st.nextToken();
			String subject = st.nextToken();
			int sNum = Integer.parseInt(st.nextToken());
			double grade = Double.parseDouble(st.nextToken());

			student.add(new Student(name, subject, sNum, grade));
		}
		for (Student st : student) {
			System.out.println("-----------------------------");
			System.out.println("�̸�:" + st.getName());
			System.out.println("�а�:" + st.getSubject());
			System.out.println("�й�:" + st.getsNum());
			System.out.println("�������:" + st.getGrade());
		}
		System.out.println("-----------------------------");
		while (true) {
			System.out.print("�л� �̸� >> ");
			String sName = sc.next();
			if (sName.equals("�׸�")) {
				sc.close();
				return;
			}
			for (int i = 0; i < student.size(); i++) {
				if (student.get(i).getName().equals(sName))
					System.out.println(student.get(i).toString());
			}
		}
	}
}
