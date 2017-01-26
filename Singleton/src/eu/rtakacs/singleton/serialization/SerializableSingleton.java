package eu.rtakacs.singleton.serialization;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{

	private static final long serialVersionUID = 1L;
	private static SerializableSingleton INSTANCE = new SerializableSingleton();
	
	private SerializableSingleton(){}
	
	public static SerializableSingleton getInstance(){
		return INSTANCE;
	}
	
	/**
	 * Implementing readResolve(){ getInstance(); } prevents to have multiple instancef of singeton after deserialization.
	 * @return
	 */
	protected Object readResolve(){
		return  getInstance();
	}
	
	public void doSomething(){
		System.out.println("SerializableSingleton.doSomething()");
	}
}
