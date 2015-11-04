package digitalNotepad;

import java.util.Scanner;

public class SecureNotepad extends AbstractNotepad {
	
	private final Scanner sc = new Scanner(System.in);
	
	private String password;
	private boolean isPasswordSet = false;
	
	public void setPassword(String password) {
		
		if (!isPasswordSet) {			
			this.password = password;
			isPasswordSet = true;
		}
	}
	
	public void changePassword(String newPassword) {
		if (login()) {
			isPasswordSet = false;
			setPassword(newPassword);
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
