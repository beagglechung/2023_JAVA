package Behaviour;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//매개 변수가 없는 버전
public class Behaviour2 {
	private static Car[] carArray  = {
		    new Car(1, "BENS SCLASS", "BLACK", 11000), 
		    new Car(2, "BNW 9", "BLUE", 8000), 
		    new Car(3, "KEA 9", "WHITE", 7000)
		};

	private static List<Car> inventory = Arrays.asList(carArray);

		public static List<Car> filterCarByColor(List<Car> inventory,  String color) {
		    List<Car> result = new ArrayList<>();                           
		    for (Car car: inventory){
		        if ( car.getColor().equals(color) ) result.add(car);//색의 변경이 필요하면 매개변수를 변경
		    }
		    return result;
		}
		public static void main(String args[]) {
			System.out.println(filterCarByColor(inventory, "BLACK"));	
		}
}
