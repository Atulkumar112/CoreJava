/* Inheritance is when a child class inherited to parent class. (we can use it extends keyword for it)
Single Inheritnce is when a chile class inherited to the arent class.
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


class LC {
	 public static void main(String[] args) {
		 Dog d = new Dog();
		 d.bark();
		 d.eat();
	 }
}


//Output
// Barking.........
// Eating............
