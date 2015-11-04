package hw11;

public class Call {
	
	private static double priceForAMinute;
	private GSM caller;
	private GSM reciever;
	private double duration;
	
	Call(GSM caller, GSM reciever, double duration){
		
		this.caller = caller;
		this.reciever = reciever;
		if(validateDuration(duration)){
			this.duration = duration;
		}
		
	}
	public static double setPriceForAMinute(double price){	
		return priceForAMinute = price;
	}
	
	public GSM setCaller (GSM caller){	
		return this.caller = caller;
	}
	
	public GSM setReciever(GSM reciever){	
		return this.reciever = reciever;
	}
	
	public double setDuration(double duration){
		
		if (validateDuration(duration)){
			return this.duration = duration;
		}else{
			return 0;
		}
	}
	
	public static double getPriceForAMinute(){
		return priceForAMinute;
	}
	
	public GSM getCaller(){
		return caller;
	}
	
	public GSM getReciever(){
		return reciever;
	}
	
	public double getDuration(){
		return duration;
	}
	
	public static boolean validateDuration(double duration){
		if(duration >= 0 && duration <= 120){
			return true;
		}else{
			return false;
		}
	}

}
