package assignment.week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel;
		float mobileWeight;
		System.out.println("Calling Now....");		
	}
	
	public void sendMsg() {
		boolean isFullyCharged;
		int mobileCost;
		System.out.println("Message Sent");		
	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is my mobile");
		
	}

}
