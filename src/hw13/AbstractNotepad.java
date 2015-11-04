package hw13;

public abstract class AbstractNotepad implements Notepad {
	
	private static final int INITIAL_CAPACITY = 16;
	
	private Page[] pages;
	private int size;
	private int capacity;
	
	public AbstractNotepad() {
		capacity = INITIAL_CAPACITY;
		pages = new Page[capacity];
		size = 0;
	}
	
	public void addPage(Page page) {
		
		ensureCapacity();
		
		pages[size] = page;
		++size;
	}
	
	public void insertAt(Page page, int index) {
		if (index < 0 || index >= size) {
			return;
		}
		
		ensureCapacity();
		
		for(int i = size; i > index; --i) {
			pages[i] = pages[i - 1];
		}
		
		pages[index] = page;
		
		++size;
	}
	
	public void removeAt(int index) {
		if (index < 0 || index >= size) {
			return;
		}
		
		for(int i = index; i < size - 1; ++i) {
			pages[i] = pages[i + 1];
		}
		
		pages[size - 1] = null;
		
		--size;
		
	}
	
	private void resize() {
		capacity *= 2;
		Page[] newArray = new Page[capacity];
		
		for(int i=0; i < size; ++i) {
			newArray[i] = pages[i];
		}
		
		pages = newArray;
	}
	
	private void ensureCapacity() {
		if (size >= capacity) {
			resize();
		}
	}
	
	public Page get(int index) {
		return pages[index];
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean search(String word){
		
		for(int i = 0; i < getSize(); i++){
			
			if(pages[i].searchWord(word)){
				
				return true;
			}
		}
		return false;
	}
	
	public void printAllPagesWithDigits(){
		
		for(int i = 0; i < size; i++){
			
			if(pages[i].containsDigits()){
				
				System.out.println(pages[i].toString());
			}
		}
	}
	
	@Override
	public String getView() {
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i < getSize(); ++i) {
			Page page = get(i);
			builder.append(page.toString());
			builder.append("\n\n");
		}
		
		return builder.toString();
	}
}
