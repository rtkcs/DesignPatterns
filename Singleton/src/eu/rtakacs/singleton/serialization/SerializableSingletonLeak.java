package eu.rtakacs.singleton.serialization;

import java.io.Serializable;

public class SerializableSingletonLeak implements Serializable{

	private static final long serialVersionUID = 1L;
	private static SerializableSingletonLeak INSTANCE = new SerializableSingletonLeak();
	
	private SerializableSingletonLeak(){}
	
	public static SerializableSingletonLeak getInstance(){
		return INSTANCE;
	}
	
	/**
	 * Implementing readResolve(){ getInstance(); } prevents to have multiple instancef of singeton after deserialization.
	 * @return
	 */
//	protected Object readResolve(){
//		return  getInstance();
//	}
	
	public void doSomething(){
		System.out.println("SerializableSingleton.doSomething()");
	}
}
