package hw13;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SecureNotepad extends AbstractNotepad {
	
	private final Scanner sc = new Scanner(System.in);
	
	private String password;
	private boolean isPasswordSet = false;
	
	private SecureNotepad(String pw){
		password = pw;
		isPasswordSet = true;
	}
	
	private static SecureNotepad createSN(String pw){
		return new SecureNotepad(pw);
	}
	
	public static SecureNotepad setPassword(String pw) {
		
			if(isStrongPassword(pw)){
				return new SecureNotepad(pw);
			}else{
				throw new RuntimeException("NULL POINTER");
			}
	}
	
	private static boolean isStrongPassword(String password){
		
		/* Ne e nito krasivo nito optimizirano ,no bez biblioteki i s tova koeto sme vzeli dosega 
		 * samo za takova reshenie se seshtam. 
		*/
		if(password.length() >= 5){
			
			for(int i = 0; i < password.length(); i++){
				
				if(Page.isDigit(password.charAt(i))){
					
					for (int j = 0; j < password.length(); j++){
						
						if((int)password.charAt(j) >= 65 && (int)password.charAt(j) <=90){ //A - Z
							
							for(int z = 0; z < password.length(); z++){
								
								if((int)password.charAt(z) >= 97 && (int)password.charAt(z) <=122){ // a - z
									
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	public void changePassword(String newPassword) {
		if (login()) {
			isPasswordSet = false;
			setPassword(newPassword);
		}
	}
	
	public void searchWord(String word){
		
		if(login()){
			
			if(search(word)){
				System.out.println("There is a match.");
			}else{
				System.out.println("There is no such word.");
			}
		}
	}
	
	public void printAllPagesWithDigits(){
		
		if(login()){
			super.printAllPagesWithDigits();
		}
	}

	@Override
	public void addTextOn(String text, int pageNumber) {
				
		if (login()) {
			get(pageNumber).addText(text);
		}
		
	}

	@Override
	public void setTextOn(String text, int pageNumber) {
		
		if (login()) {
			get(pageNumber).setText(text);
		}
	}

	@Override
	public void deleteTextOn(int pageNumber) {
		
		if (login()) {
			get(pageNumber).deleteText();
		}
		
	}
	
	@Override
	public String getView() {
		if (login()) {
			return super.getView();
		}
		
		return null;
	}
	
	private String requestPassword() {
		
		System.out.println("Enter password: ");
		String password = sc.next();
		return password;
		
	}
	
	private boolean login() {
		if (!isPasswordSet) {
			return false;
		}
		
		String enteredPassword = requestPassword();
		
		if (enteredPassword.equals(password)) {
			return true;
		}
		
		return false;
	}
}
