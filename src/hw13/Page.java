package hw13;

public class Page {
	
	private String title;
	private String text;
	
	public Page() {
		this("", "");
	}
	
	public Page(String title) {
		this(title, "");
	}
	
	public Page(String title, String text) {
		this.title = title != null ? title : "";
		this.text = text != null ? text : "";
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if (this != null) {			
			this.title = title;
		}
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		if (text != null) {			
			this.text = text;
		}
	}
	
	public void addText(String text) {
		if (text != null) {			
			this.text += text;
		}
	}
	
	public void deleteText() {
		setText("");
	}
	
	public boolean searchWord(String word){
		
		if(text.indexOf(word) == -1){
			
			return false;
		}else{
			return true;
		}
	}
	
	public boolean containsDigits(){
		
		for(int i = 0; i < text.length(); i++){
			
			if(isDigit(text.charAt(i))){
				return true;
			}
		}	
		return false;
	}
	
	public static boolean isDigit(char c){
		
		switch (c) {
		
		case '0': return true;
		case '1': return true;
		case '2': return true;
		case '3': return true;
		case '4': return true;
		case '5': return true;
		case '6': return true;
		case '7': return true;
		case '8': return true;
		case '9': return true;
		
		default: return false;	
		}
	}
	
	@Override
	public String toString() {
		return String.format("[%s]\n%s", getTitle(), getText());
	}
}
