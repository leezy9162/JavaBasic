package day13.runtimeExceptionEx;

public class ClassCastExceptionEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
//		if (animal instanceof Dog) {
			Dog dog = (Dog) animal; //ClassCastException
//		}
	}

}
