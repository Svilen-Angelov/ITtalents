package hw13;

import java.io.File;
import java.io.IOException;

public class NotepadDemo {
	
	public static void main(String[] args) {
		
		Page p = new Page();
		p.setTitle("Java");
		p.addText("This is the beginning....");
		
		
		//System.out.println(p.toString());
		
//		ElectronicSecuredNotepad mynote = new ElectronicSecuredNotepad();
//		
//		mynote.start();
//		mynote.addPage(p);
//		mynote.setPassword("1234qA");
//		mynote.addPage(new Page("kindle doc", "pretty kewl"));
//		
//		System.out.println(mynote.getView());
//		
//		mynote.stop();
//		System.out.println(mynote.getView());
		
		try{
			SecureNotepad mynote = SecureNotepad.setPassword("1234pwRQ");
		}catch (RuntimeExeption e){
			
		}
//		SecureNotepad.setPassword("12qwAS");
//		secnote.addPage(p);
//		notepad.addPage(new Page("C++", "Pretty cool!"));
//		notepad.addPage(new Page("hiddendigit", "there is a digit4 here."));
//		notepad.addPage(new Page("hiddendigit2", "On3 mor3 with 4 digit."));
//		
//		notepad.setPassword("12qwAS");
//		
//		notepad.addTextOn("\nAnd exciting! :)", 1);
//		
//		notepad.searchWord("etrty");
//		
//		notepad.searchWord("cool");
//		
//		notepad.printAllPagesWithDigits();
		
		//System.out.println(notepad.getView());
	}

}
