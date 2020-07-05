package final_test.test02_grade;

import java.util.*;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList <Character> grade = new ArrayList<Character>();
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for (int i = 0 ; i < 6 ; i++)
			grade.add(sc.next().charAt(0));
		
		double avg = gradeToScore(grade);
		System.out.println(avg);
		sc.close();
	}
	static double gradeToScore(List<Character> gList) {
		double sum = 0;
		double avg;
		HashMap<Character, Double> grade = new HashMap<Character, Double>();
		grade.put('A', 4.0);
		grade.put('B', 3.0);
		grade.put('C', 2.0);
		grade.put('D', 1.0);
		grade.put('F', 0.0);
				
		for (int i = 0 ; i < gList.size() ; i++) {
			sum += grade.get(gList.get(i));
		}
		avg = sum/gList.size();
		return avg;
	
	}
}
