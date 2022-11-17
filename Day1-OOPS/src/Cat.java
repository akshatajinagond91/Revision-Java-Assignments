
public class Cat extends Animal {

	String nickName;

	@Override
	public void makeNoise() {
		System.out.println("cat is making noise");
		
	}

	public Cat(String name, String nickName) {
		super(name);
		this.nickName = nickName;
	}
	
	public Cat() {
		
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public void eat() {
		System.out.println("cat is making eating");
		
	}
	
	public static void jump() {
		System.out.println("cat is jumping");
	}
}
