/*Hierarchical Inheritance is when two or more child class is inherited to one parent class.
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

class Cat extends Animal{
	void sleep() {
		System.out.println("Sleeping.....");
	}
}


class LC {
	 public static void main(String[] args) {
		 Cat c = new Cat();
		 c.sleep();
		 c.eat();
		 Dog d = new Dog();
		 d.bark(); 
		 d.eat();
	 }
}


/*
Sleeping.....
Eating............
Barking.........
Eating............

*/
