
public class Dog extends Animal {
	
String breed;

@Override
public  void  makeNoise() {
	System.out.println("dog is barking");
	
}

@Override
public  void  eat() {
	System.out.println("dog is eating");
	
}


public static void play() {
	System.out.println("Dog is playing");
}

	public Dog() {
	
}

	public String getBreed() {
	return breed;
}

public void setBreed(String breed) {
	this.breed = breed;
}

	public Dog(String name, String breed) {
	super(name);
	this.breed = breed;
}

	

}
