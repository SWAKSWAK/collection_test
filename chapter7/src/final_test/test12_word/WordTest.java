package final_test.test12_word;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class WordTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Word> word = new Vector<Word>();
		ArrayList<Word> ranWord = new ArrayList<Word>(4);
		word.add(new Word("painting", "�׸�"));
		word.add(new Word("bear", "��"));
		word.add(new Word("eye", "��"));
		word.add(new Word("picture", "����"));
		word.add(new Word("society", "��ȸ"));
		word.add(new Word("human", "�ΰ�"));
		word.add(new Word("earth", "����"));

		System.out.println("\"��ǰ����\"�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� ����˴ϴ�.");
		while (true) {
			System.out.print("�ܾ� �׽�Ʈ:1, �ܾ� ����:2, ����3 >>");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("����" + word.size() + "���� �ܾ ��� �ֽ��ϴ�.");
				while (true) {
					for (int i = 0; i < 4; i++) {
						Word ran = word.get((int) (Math.random() * word.size()));

						if (ranWord.contains(ran)) {
							i--;
							continue;
						}
						ranWord.add(ran);
					}
					String q = ranWord.get((int) (Math.random() * 4)).getEngWord();
					System.out.println(q + "?");
					System.out.print("(1)" + ranWord.get(0).getKorWord() + "(2)" + ranWord.get(1).getKorWord() + "(3)"
							+ ranWord.get(2).getKorWord() + "(4)" + ranWord.get(3).getKorWord());

					while (!sc.hasNextInt()) {
						System.out.print("���ڸ� �Է��� �ּ���>> ");
						sc.next();
					}
					int answer = sc.nextInt();
					if (answer == -1)
						break;
					if (q.equals(ranWord.get(answer - 1).getEngWord())) {
						System.out.println("Excellent !!");
					} else {
						System.out.println("No !!");
					}
					ranWord.clear();
				}
				break;
			case 2:
				System.out.println("����ܾ �׸��� �Է��ϸ� �����մϴ�.");
				while (true) {
					System.out.print("���� �ѱ� �Է� >> ");

					String eng = sc.next();
					if (eng.equals("�׸�"))
						break;
					String kor = sc.nextLine();

					for (int i = 0; i < word.size(); i++) {
						if (!word.get(i).getEngWord().equals(eng))
							word.add(new Word(eng, kor));
					}
				}
				break;
				
			case 3:
				System.out.println("\"��ǰ����\"�� �����մϴ�.");
				sc.close();
				return;
			}
		}
	}
}
