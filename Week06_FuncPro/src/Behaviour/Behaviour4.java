package Behaviour;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//익명 클래스 사용
class BlueCheapPredicate implements CarPredicate {
    public boolean test(Car car){
            return "BLUE".equals(car.getColor()) && car.getPrice() <= 10000;
    }
}
public class Behaviour4 {
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
			List<Car> blueCars = filterCars(inventory, new CarPredicate() {     
			    public boolean test(Car car1){
			        return "BLUE".equals(car1.getColor());
			    }
			});
			System.out.println(blueCars);
		}
}
