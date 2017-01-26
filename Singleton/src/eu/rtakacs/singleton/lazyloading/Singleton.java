package eu.rtakacs.singleton.lazyloading;

public class Singleton {
	
	private Singleton(){
		System.out.println("eu.rtakacs.singleton.lazyloading.Singleton() : Initializing Instance");
	}
	
	private static Singleton INSTANCE;
	
	/**
	 * double checked locking mechanism <br>
	 * The "Double-Checked Locking is Broken" Declaration
	 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
	 * 
	 * @return
	 */
	public static Singleton getInstance(){
		if(INSTANCE == null){
			synchronized(Singleton.class){
				if(INSTANCE == null){
					System.out.println("eu.rtakacs.singleton.lazyloading.Singleton.getInstance() : 1st time getInstance invoked");
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}
	
	public void doSomething(){
		System.out.println("Singleton.doSomething()");
	}
}
