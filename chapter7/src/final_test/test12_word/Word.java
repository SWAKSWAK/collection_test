package final_test.test12_word;

public class Word {
	private String korWord;
	private String engWord;
	
	public Word(String engWord, String korWord) {
		this.korWord = korWord;
		this.engWord = engWord;
	}
	public String getEngWord() {
		return engWord;
	}
	public String getKorWord() {
		return korWord;
	}
}
