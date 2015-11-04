package hw13;

public interface Notepad {
	
	void addTextOn(String text, int pageNumber);
	void setTextOn(String text, int pageNumber);
	void deleteTextOn(int pageNumber);
	void searchWord(String word); // napravil sum go da izpisva suobshtenie a ne da e tip boolean.
	void printAllPagesWithDigits();
	String getView();
}
