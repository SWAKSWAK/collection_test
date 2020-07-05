package final_test.test12_word;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class WordTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Word> word = new Vector<Word>();
		ArrayList<Word> ranWord = new ArrayList<Word>(4);
		word.add(new Word("painting", "그림"));
		word.add(new Word("bear", "곰"));
		word.add(new Word("eye", "눈"));
		word.add(new Word("picture", "사진"));
		word.add(new Word("society", "사회"));
		word.add(new Word("human", "인간"));
		word.add(new Word("earth", "지구"));

		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료됩니다.");
		while (true) {
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료3 >>");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("현재" + word.size() + "개의 단어가 들어 있습니다.");
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
						System.out.print("숫자를 입력해 주세요>> ");
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
				System.out.println("영어단어에 그만을 입력하면 종료합니다.");
				while (true) {
					System.out.print("영어 한글 입력 >> ");

					String eng = sc.next();
					if (eng.equals("그만"))
						break;
					String kor = sc.nextLine();

					for (int i = 0; i < word.size(); i++) {
						if (!word.get(i).getEngWord().equals(eng))
							word.add(new Word(eng, kor));
					}
				}
				break;
				
			case 3:
				System.out.println("\"명품영어\"를 종료합니다.");
				sc.close();
				return;
			}
		}
	}
}
