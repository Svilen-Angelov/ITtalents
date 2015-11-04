package digitalNotepad;

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
	
	@Override
	public String toString() {
		return String.format("[%s]\n%s", getTitle(), getText());
	}
}
