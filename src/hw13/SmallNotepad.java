package hw13;

public class SmallNotepad extends AbstractNotepad {

	private static final int MAX_SYMBOLS = 1000;
	
	public void searchWord(String word){
		
			if(search(word)){
				System.out.println("There is a match.");
			}else{
				System.out.println("There is no such word.");
			}
	}
	
	public void printAllPagesWithDigits(){

			super.printAllPagesWithDigits();
	}
	
	@Override
	public void addTextOn(String text, int pageNumber) {
		
		Page page = get(pageNumber);
		if (page.getText().length() + text.length() <= MAX_SYMBOLS) {			
			page.addText(text);
		}
	}

	@Override
	public void setTextOn(String text, int pageNumber) {
		
		if (text.length() <= MAX_SYMBOLS) {			
			get(pageNumber).addText(text);
		}		
	}

	@Override
	public void deleteTextOn(int pageNumber) {
		get(pageNumber).deleteText();
		
	}
}
