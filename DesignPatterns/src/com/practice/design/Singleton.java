package src.com.practice.design;

public class Singleton {
	
	// Volatile ensures visibility of changes across threads
	public static volatile Singleton instance;
	
	// Private constructor to prevent instantiation
	private Singleton() {

	}
	
	// Double-checked locking to ensure thread safety
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
			return instance;
	}

}
