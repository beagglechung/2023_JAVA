package MethRe;
import java.util.function.BiFunction;

class Calcu{
	public static int add(int a, int b) {
		return a + b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> obj = Calcu::add;
		int result = obj.apply(10, 20);
		System.out.println("주어진 수의 덧셈: " + result);
	}
}
