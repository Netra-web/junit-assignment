package abstractPrinciples;

//if any class has any of its method abstract then you must declare entire class abstract
abstract class AbstractPrinciples {
	abstract void Demo();
	// abstract method cannot be instantiated
	// abstract class cannot be private or final
	// u can declare a class abstract without having any abstract method
 
}

 class Test extends AbstractPrinciples{ 
//when we extend an abstract class,we must either override all the abstract method in 
	 						//subclass or declare subclass as abstract
	@Override
	void Demo() {

	}
	 
 }
