import java.util.List;

public class Test {
	public static void main(String args[]) {

		List<Integer> list = List.of(12, 3, 16, 2, 1, 9, 7, 20);
		list.stream()
			.filter(e -> e % 2 == 0)
			.forEach(System.out::println);
	}
}