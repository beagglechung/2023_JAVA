package phone;

public class PhoneExample {
	
	public static class SmartPhone extends Phone {
		//생성자
		public SmartPhone(String owner) {
			super(owner);
		}
		//메소드
		public void internetSearch() {
			System.out.println("인터넷 검색을 합니다.");
		}
	}
	
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x) 추상클래스이기 때문에 사용하지 않는다
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
