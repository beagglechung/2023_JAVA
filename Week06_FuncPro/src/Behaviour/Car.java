package Behaviour;
public class Car{
	int id;
	String model;
	String color;
	int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Car(int id, String model, String color, int price) {
		super();
		this.id = id;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
}