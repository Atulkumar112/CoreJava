/*
Overriding is when it have same name of method and same parameter. It called overriding/runtime polymorphism. 
we can override a method from any class to any class. but we can't override final method, static mehotd and private method.
*/
class A{
	public void meth1() {
		System.out.println("This is method 1 of class A");
	}
}

class B extends A{
	@Override
	public void meth1() {
		System.out.println("This is method 1 of class B");
	}
}

class LC {
	public static void main(String args[]) {
		A a = new A();
		a.meth1();
		
		B b = new B();
		b.meth1();
	}
}
