package hw13;

public class ElectronicSecuredNotepad extends SecureNotepad implements ElectronicDevice{
	
	private boolean isStarted;
	
	public void start(){
		isStarted = true;
	}
	
	public void stop(){
		isStarted = false;
	}
	
	public boolean isStarted(){
		return isStarted;
	}

	//@Override
//	public void setPassword(String password) {
//		if(isStarted){
//		super.setPassword(password);
//		}
//	}

	@Override
	public void changePassword(String newPassword) {
		if(isStarted){
		super.changePassword(newPassword);
		}
	}

	@Override
	public void searchWord(String word) {
		if(isStarted){
		super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if(isStarted){
		super.printAllPagesWithDigits();
	}
	}

	@Override
	public void addTextOn(String text, int pageNumber) {
		if(isStarted){
		super.addTextOn(text, pageNumber);
	}
	}

	@Override
	public void setTextOn(String text, int pageNumber) {
		if(isStarted){
		super.setTextOn(text, pageNumber);
	}
	}

	@Override
	public void deleteTextOn(int pageNumber) {
		if(isStarted){
		super.deleteTextOn(pageNumber);
	}
	}


	@Override
	public String getView() {
		if(isStarted){
		return super.getView();
	}else{
		return "Device is not Started.";
	}
	}
	
	

}
