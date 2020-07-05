package final_test.test05_student;

/*
 황기태, 모바일, 1, 4.1
이재문, 안드로이드, 2, 3.9
김남윤, 웹공학, 3, 3.5
최찬미, 빅데이터, 4, 4.25
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();

		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
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
			System.out.println("이름:" + st.getName());
			System.out.println("학과:" + st.getSubject());
			System.out.println("학번:" + st.getsNum());
			System.out.println("학점평균:" + st.getGrade());
		}
		System.out.println("-----------------------------");
		while (true) {
			System.out.print("학생 이름 >> ");
			String sName = sc.next();
			if (sName.equals("그만")) {
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
