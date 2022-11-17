
public abstract class Animal {
	
	String name;
	
	public abstract void  makeNoise() ;
	
	public abstract void  eat() ;
	
		
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public Animal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void sleep() {
		System.out.println("Animal is sleeping");
	}

	public static void main(String[] args) {
		
		
	}

}
