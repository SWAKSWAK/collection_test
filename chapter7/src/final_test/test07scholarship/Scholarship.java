package final_test.test07scholarship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Scholarship {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		HashMap <String, Double> nameGrade = new HashMap<String, Double>();//�л�����
		ArrayList<String> sName = new ArrayList<String>();//���л����
		
		System.out.println("�̷� ���б� ���� �ý��� �Դϴ�.");
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print("�̸��� ����>>");
			nameGrade.put(sc.next(), sc.nextDouble());//�л������Է�
		}
		System.out.print("���л� ���� ���� ���� �Է�>>");
		double standard = sc.nextDouble();//����
		for(String name : nameGrade.keySet()) {
			if (nameGrade.get(name) > standard)//���غ���ũ�� 
				sName.add(name);//���л���ܿ� �߰�
		}
		System.out.print("���л� ��� : ");
		for (String name : sName)
			System.out.print(name + " ");//���л���� ���
		sc.close();
	}
}
