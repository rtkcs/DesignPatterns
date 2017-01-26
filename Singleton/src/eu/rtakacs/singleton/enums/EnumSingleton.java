package eu.rtakacs.singleton.enums;


/**
 * Each enum field creates an instance only once.<br>
 * Lazy initialization by the JVM.
 * @author rtakacsux
 *
 */
public enum EnumSingleton {
	INSTANCE;
	private EnumSingleton(){
		System.out.println("EnumSingleton.EnumSingleton()");
	}
	
	public void doSomethig(){
		System.out.println("EnumSingleton.doSomething()");
	}
}
