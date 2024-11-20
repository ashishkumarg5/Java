package src.com.practice.design;

public class Test {
	
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singelton2 = Singleton.getInstance();
		
		System.out.println(singleton1 == singelton2);
	}

}
