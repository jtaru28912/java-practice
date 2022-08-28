//downcasting example

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class Down1 {
	public static void man(String args[])
	{
		Dog d=new Dog();
		Animal a=new Dog();
		//Dog e=new Animal();//downcasting
		//Dog e=(Dog) new Animal();//Downcasting
		System.out.println(d instanceof Dog);//true
		System.out.println(a instanceof Dog);//true
		System.out.println(a instanceof Cat);//true
		System.out.println(a instanceof Animal);//false
		Animal b= new Cat();
		System.out.println(b instanceof Cat);//true
		System.out.println(b instanceof Animal);//true
		System.out.println(b instanceof Dog);//false
		
		


	}

}
