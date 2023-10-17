package Behaviour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BlackCheapPredicate implements CarPredicate {
    public boolean test(Car car){
            return "WHITE".equals(car.getColor()) && car.getPrice() <= 10000;
    }
}
public class Behaviour5 {
	private static Car[] carArray  = {
		    new Car(1, "BENS SCLASS", "BLACK", 11000), 
		    new Car(2, "BNW 9", "BLUE", 8000), 
		    new Car(3, "KEA 9", "WHITE", 7000)
		};

		private static List<Car> inventory = Arrays.asList(carArray);

		public static List<Car> filterCars(List<Car> inventory,  CarPredicate p) {
		    List<Car> result = new ArrayList<>();
		    for(Car car: inventory) {
		        if(p.test(car))  result.add(car);
		    }
		    return result;
		}
		
		public static void main(String args[]) {
			List<Car> blackCars =  filterCars(inventory, (Car car) -> "BLACK".equals(car.getColor()));
			System.out.println(blackCars);
		}
}
