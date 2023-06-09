package Data;

public class SendRec {
	
	private static int line;
	private static int Word;
	private static int Count;
	private static int Char;
	private static int Space;
	
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getWord() {
		return Word;
	}
	public void setWord(int word) {
		Word = word;
	System.out.print(word);
	}
	
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	
	public int getSpace() {
		return Space;
	}
	public void setSpace(int space) {
		Space = space;
	}
	public int getChar() {
		return Char;
	}
	public void setChar(int c) {
		Char = c;
	}
	
}
