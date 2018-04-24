package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<>();
		Animal pig = new Pig();
		Animal cow = new Cow();
		Animal dog = new Dog();
		Animal max = new Max();
		Animal max1 = new Max();
		Animal dog1 = new Dog();
		farm.add(pig);
		farm.add(cow);
		farm.add(dog);
		farm.add(max);
		farm.add(max1);
		farm.add(dog1);
		for (Animal a: farm) {
			a.makeNoise();
			a.goToTheBathroom();
		}
	}
}
