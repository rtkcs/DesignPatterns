package eu.rtakacs.singleton.earlyloading;

public final class Singleton {
	
	private static Singleton INSTANCE = new Singleton();
	
	
	/**
	 * Throwing an exception from contructor prevent from creation with reflection.
	 */
	private Singleton(){
		if(INSTANCE != null){
			throw new IllegalStateException("Already instantiated");
		}
		System.out.println("eu.rtakacs.singleton.earlyloading.Singleton");
	}
	
	
	public static Singleton getInstance(){
		return INSTANCE;
	}
	
	/**
	 * Throwing an exception from clone will prevent from cloning.
	 */
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Cannot clone instance of this class");
	}
	
	public void doSomething(){
		System.out.println("Singleton.doSomething()");
	}
}
