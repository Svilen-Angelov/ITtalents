package digitalNotepad;

public class NotepadDemo {
	
	public static void main(String[] args) {
		
		Page p = new Page();
		p.setTitle("Java");
		p.addText("This is the beginning....");
		
//		System.out.println(p.toString());
		
		SecureNotepad notepad = new SecureNotepad();
		notepad.addPage(p);
		notepad.addPage(new Page("C++", "Pretty cool!"));
		
		notepad.setPassword("1234");
		
		notepad.addTextOn("\nAnd exciting! :)", 1);
		
		System.out.println(notepad.getView());
	}

}
