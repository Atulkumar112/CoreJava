/*
Maltilevel inheritance is a inheritance when a  child class inherited to the parent class and again parent class inherited to the grand parent class.
*/


class Animal{
	void eat() {
		System.out.println("Eating............");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Barking.........");
	}
}

class BabyDog extends Dog{
	void sleep() {
		System.out.println("Sleeping.....");
	}
}


class LC {
	 public static void main(String[] args) {
		 BabyDog d = new BabyDog();
		 d.sleep();
		 d.bark();
		 d.eat();
	 }
}


/*output
Sleeping.....
Barking.........
Eating............
/*
