package Behaviour;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Behaviour1 {
	private static Car[] carArray  = {
		    new Car(1, "BENS SCLASS", "BLACK", 11000), 
		    new Car(2, "BNW 9", "BLUE", 8000), 
		    new Car(3, "KEA 9", "WHITE", 7000)
		};
	private static List<Car> inventory = Arrays.asList(carArray);

		public static List<Car> filterWhiteCars(List<Car> inventory) {
		    List<Car> result = new ArrayList<>();                           
		    for (Car car: inventory){
		        if ("WHITE".equals(car.getColor()))            		result.add(car);
		    }
		    return result;
		}
		public static void main(String args[]) {
			System.out.println(filterWhiteCars(inventory));	
		}
}
