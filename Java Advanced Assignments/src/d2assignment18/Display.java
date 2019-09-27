package d2assignment18;


public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("Meat and Rice",6,4);
		Dog dog = new Dog("Meat",8,4);
		Hippo hippo =  new Hippo("Grass",10,4);
		cat.livesIn();
		cat.eat();
		cat.sleep();
		System.out.println();
		dog.livesIn();
		dog.eat();
		dog.sleep();
		System.out.println();
		hippo.eat();
		cat.sleep();

	}

}

abstract class Animal{
	protected String food;
	protected int sleep;
	protected int legs;
	public Animal(String food, int sleep,int legs) {
		this.food = food;
		this.sleep = sleep;
		this.legs = legs;
	}
	abstract void eat();
	abstract void sleep();
	public void walk(int legs) {
		System.out.println("Walks with "+this.legs+" legs.");
	}
}
interface PetAnimal{
	public void livesIn();
}
class Hippo extends Animal{
	//private int swims;
	public Hippo(String food, int sleep,int legs) {
		super(food,sleep,legs);
	}
	public void eat() {
		System.out.println("Hippo eats "+super.food);
		
	}
	public void sleep() {
		System.out.println("Hippo sleep for "+super.sleep+" hours");
	}
}
class Dog extends Animal implements PetAnimal{
	//private int swims;
	public void livesIn() {
		System.out.println("Dogs live in house and the are loyal");
	}
	public Dog(String food, int sleep,int legs) {
		super(food,sleep,legs);
	}
	public void eat() {
		System.out.println("Dog eats "+super.food);
		
	}
	public void sleep() {
		System.out.println("Dog sleeps for "+super.sleep+" hours");
	}
}
class Cat extends Animal implements PetAnimal{
	//private int swims;
	public void livesIn() {
		System.out.println("Cats live in house and they are not loyal");
	}
	public Cat(String food, int sleep,int legs) {
		super(food,sleep,legs);
	}
	public void eat() {
		System.out.println("Cat eats "+super.food);
		
	}
	public void sleep() {
		System.out.println("Cat sleeps for "+super.sleep+" hours");
	}
}
