package eu.rtakacs.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import eu.rtakacs.singleton.enums.EnumSingleton;
import eu.rtakacs.singleton.serialization.SerializableSingleton;
import eu.rtakacs.singleton.serialization.SerializableSingletonLeak;

public class SingletonTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		eu.rtakacs.singleton.lazyloading.Singleton lazySingleton = eu.rtakacs.singleton.lazyloading.Singleton.getInstance();
		lazySingleton.doSomething();
		
		eu.rtakacs.singleton.earlyloading.Singleton earlySingleton = eu.rtakacs.singleton.earlyloading.Singleton.getInstance();
		earlySingleton.doSomething();
		
		EnumSingleton.INSTANCE.doSomethig();
		//
		//--serialization test
		//
		SerializableSingleton ss = SerializableSingleton.getInstance();
		serializeObject(ss);
		SerializableSingleton singleton1 = (SerializableSingleton)deserializeObject();
		SerializableSingleton singleton2 = (SerializableSingleton)deserializeObject();
		printSingleton(singleton1, singleton2);
		
		
		SerializableSingletonLeak ssl = SerializableSingletonLeak.getInstance();
		serializeObject(ssl);
		SerializableSingletonLeak ssl1 = (SerializableSingletonLeak)deserializeObject();
		SerializableSingletonLeak ssl2 = (SerializableSingletonLeak)deserializeObject();
		printSingleton(ssl1, ssl2);
	}
	
	private static void serializeObject(Object obj) throws IOException{
		FileOutputStream fileOut = new FileOutputStream("/tmp/singleton.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(obj);
		out.close();
		fileOut.close();
	}	
	private static Object deserializeObject() throws IOException, ClassNotFoundException{
		FileInputStream fileIn = new FileInputStream("/tmp/singleton.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Object obj = in.readObject();
		in.close();
		fileIn.close();
		
		return obj;
	}
	private static void printSingleton(Object obj1, Object obj2){
		System.out.println();
		System.out.println("----- Singleton Test Start-----");
		System.out.println("Singleton1: " + obj1);
		System.out.println("Singleton2: " + obj2);
		System.out.println("Singletons are equal: " + obj1.equals(obj2));
		System.out.println("----- Singleton Test End-----");
		System.out.println();
	}

}
