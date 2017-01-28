package eu.rtakacs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import eu.rtakacs.abstractfactory.ship.UFOEnemyShip;

public class ReflectionTesting {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException{
		
		Class reflectClass = UFOEnemyShip.class;
		String className = reflectClass.getName();
		System.out.println("ClassName: " + className);
	
		//
		//--Class Modifier
		//
		int classModifier = reflectClass.getModifiers();
		System.out.println("Class is public: " + Modifier.isPublic(classModifier));
		System.out.println("Class is abstract: " + Modifier.isAbstract(classModifier));
		System.out.println("Class is final: " + Modifier.isFinal(classModifier));
		System.out.println("Class is interface: " + Modifier.isInterface(classModifier));
		System.out.println("Class is static: " + Modifier.isStatic(classModifier));
		System.out.println("Class is protected: " + Modifier.isProtected(classModifier));
		
		//
		//-- Interfaces, SuperClass
		//
		Class[] interfaces = reflectClass.getInterfaces();
		Class superClass = reflectClass.getSuperclass();
		System.out.println("SuperClass: " + superClass);
		System.out.println("Interfaces: " + interfaces);
		
		//
		//--Class Methods
		//
		Method[] classMethods = reflectClass.getMethods();
		String p = "";
		for(Method method : classMethods){
			p = Modifier.isPublic(method.getModifiers())? "public":"not public";
			System.out.print("MethodName: "+ p + " " + method.getReturnType() + " " + method.getName());
			
			Class[] parameterType = method.getParameterTypes();
			if(parameterType!=null && parameterType.length!=0){
				System.out.print("(");
				for(Class parameter : parameterType){
					System.out.print(" " + parameter.getName());
				}
				System.out.print(" )");
			}else{
				System.out.print("()");
			}
			System.out.println();
		}
		
		//
		//-- Constructor
		//
		Constructor constructor = null;
		Object constructor2 = null;
		constructor = reflectClass.getConstructor(new Class[]{int.class, String.class});
		UFOEnemyShip ufoShip = (UFOEnemyShip)constructor.newInstance(12, "monkeys from reflection code");
		
		System.out.println("Constructor parameters:");
		Class[] constructorParameters = constructor.getParameterTypes();
		for(Class constructorParameter : constructorParameters){
			System.out.println(constructorParameter.getName());
		}
		
		///
		///-- Field manipulation
		///
		Field privateField = UFOEnemyShip.class.getDeclaredField("idCode");
		privateField.setAccessible(true);
		String fieldValue = (String)privateField.get(ufoShip); 
		System.out.println("private String idCode = " + fieldValue);
		
		///
		///-- Method manipulation
		///
		Method privateMethod = UFOEnemyShip.class.getDeclaredMethod("getPrivateString", null);
		privateMethod.setAccessible(true);
		String methodReturnValue = (String) privateMethod.invoke(ufoShip, null);
		System.out.println("getPrivateString() = " + methodReturnValue);
		
		Class[] methodParameters = new Class[]{Integer.TYPE, String.class};
		privateMethod = UFOEnemyShip.class.getDeclaredMethod("getOtherPrivateString", methodParameters);
		privateMethod.setAccessible(true);
		methodReturnValue = (String) privateMethod.invoke(ufoShip, new Object[]{12,"monkeys"});
		System.out.println("getOtherPrivateString(int i, String s) = " + methodReturnValue);
	}
}
