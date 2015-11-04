package hw11;

public class GSM {
	
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;
	
	GSM(String model){
		this.model = model;
	}
	
	public String getModel(){
		return model;
	}
	
	public boolean getHasSimCard(){
		return hasSimCard;
	}
	
	public String getSimMobileNumber(){
		return simMobileNumber;
	}
	
	public double getOutgoingCallDuration(){
		return outgoingCallDuration;
	}
	
	public Call getLastIncomingCall(){
		return lastIncomingCall;
	}
	
	public Call getLastOutgoingCall(){
		return lastOutgoingCall;
	}
	
	public void setLastIncomingCall(Call somecall){
		lastIncomingCall = somecall;
	}
	
	public void setLastOutgoingCall(Call somecall){
		lastOutgoingCall = somecall;
	}
	
	public void insertSimCard(String simMobileNumber){
		
		if(validateMobileNumber(simMobileNumber)){
			
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
		}	
	}
	
	public void removeSimCard(){
		hasSimCard = false;
	}
	
	public void call(GSM reciever, double duration){
		
		if(Call.validateDuration(duration)){
			if(this.getHasSimCard() && reciever.getHasSimCard()){
				if(this.getSimMobileNumber() != reciever.getSimMobileNumber()){
					
					Call.setPriceForAMinute(0.45);
					Call call1 = new Call(this , reciever, duration);
					
					this.setLastOutgoingCall(call1); // taka li e po-dobre ili samo lastOutgoingcall = call1; ?
					reciever.setLastIncomingCall(call1);
					
					outgoingCallDuration += duration;
		
				}
			}
		}
	}
	
	private boolean validateMobileNumber(String number){
		if(number.length() == 10 && number.charAt(0) == '0' && number.charAt(1) == '8'){
			// zashto ne raboteshe sus && number.substring(0,2) == "08" ? 
			// neshto mai bqhte kazal zashto ne mogat da se sravnqvat taka stringove obache sum go zabravil.
			return true;
		}else{
			return false;
		}
	}
	
	public double getSumForCall(){
		
		return outgoingCallDuration * Call.getPriceForAMinute();
	}
	
	public void printInfoForTheLastOutgoingCall(){ // Tuk vrushta modela na Caller i Reciever.
		
		if(this.lastOutgoingCall == null){
			System.out.println("No info yet.");
			return;
		}
		
		System.out.println("Price for a minute : " + this.lastOutgoingCall.getPriceForAMinute());
		System.out.println("The Caller : " + this.lastOutgoingCall.getCaller().getModel());
		System.out.println("The Reciever : " + this.lastOutgoingCall.getReciever().getModel());
		System.out.println("The Duration : " + this.lastOutgoingCall.getDuration());
		
		
	}
	
	public void printInfoForTheLastIncomingCall(){ // Tuk vrushta adresa (ne znaeh koe ot dvete iskate).
		
		if(this.lastIncomingCall == null){
			System.out.println("No info yet.");
			return;
		}
		
		System.out.println("Price for a minute : " + this.lastIncomingCall.getPriceForAMinute());
		System.out.println("The Caller : " + this.lastIncomingCall.getCaller());
		System.out.println("The Reciever : " + this.lastIncomingCall.getReciever());
		System.out.println("The Duration : " + this.lastIncomingCall.getDuration());
		
	}
	
	

}
