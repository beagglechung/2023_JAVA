package lambda;

//추상 메소드 구현
public class StringConcatlmpl implements StringConcat {
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1+","+s2);
	}
}
