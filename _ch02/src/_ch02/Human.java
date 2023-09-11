package _ch02;

public class Human {
	String name;
	int height;
	int weight;
}

class HumaTester{
	public static void main(String[] args) {
		Human gildong = new Human();
		Human chulsu = new Human();
		
		gildong.name="길동";
		gildong.height=170;
		gildong.weight=60;
		
		chulsu.name="철수";
		chulsu.height=166;
		chulsu.weight=72;
		
		System.out.println("이름"+gildong.name);
		System.out.println("신장"+gildong.height+"cm");
		System.out.println("몸무게"+gildong.weight+"kg");
		
		System.out.println("이름"+chulsu.name);
		System.out.println("신장"+chulsu.height+"cm");
		System.out.println("몸무게"+chulsu.weight+"kg");
	}
}
