package Remote;

public class RemoteControl {
	   
	public static void main(String[] args) {
		Remote	rc;
		
		//rc변수에 Television객체를 대입
		rc = new Television();
		rc.turnOn();
		
		//rc변수에 Audio객체를 대입
		rc = new Audio();
		rc.turnOn();
	}
}
