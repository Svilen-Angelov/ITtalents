package hw11;

public class GSMTest {

	public static void main(String[] args) {
		
		GSM mobile1 = new GSM("Nokia");
		GSM mobile2 = new GSM("Samsung");
		
		mobile1.printInfoForTheLastOutgoingCall();
		
		mobile1.insertSimCard("0888237461");
		mobile1.getHasSimCard();
		
		System.out.println(mobile1.getHasSimCard());
		System.out.println(mobile1.getSimMobileNumber());
		
		mobile1.removeSimCard();
		
		System.out.println(mobile1.getHasSimCard());
		
		mobile1.insertSimCard("0888123456");
		mobile2.insertSimCard("0888111222");
		
		mobile1.call(mobile2, 33.21);
		
		mobile1.printInfoForTheLastOutgoingCall();
		mobile1.printInfoForTheLastIncomingCall();
		
		mobile2.printInfoForTheLastIncomingCall();
		mobile2.printInfoForTheLastOutgoingCall();
		
		GSM mobile3 = new GSM("Apple");
		mobile3.insertSimCard("0812312388");
		
		mobile1.call(mobile3, 12.43);
		
		mobile1.printInfoForTheLastOutgoingCall();
		mobile3.printInfoForTheLastIncomingCall();
		
		System.out.println(mobile1.getOutgoingCallDuration());
		System.out.println(mobile1.getSumForCall() + " leva");
		
		
		
		

	}

}
