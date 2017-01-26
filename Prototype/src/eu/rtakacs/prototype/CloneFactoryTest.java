package eu.rtakacs.prototype;

public class CloneFactoryTest {
	public static void main(String[] arg){
		CloneFactory animalMaker = new CloneFactory();
		Sheep sally = new Sheep();
		Sheep clonedSally = (Sheep)animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println(clonedSally);
		
		System.out.println("Sally hashcode: \t" + System.identityHashCode(System.identityHashCode(sally)));
		System.out.println("Sally hashcode: \t" + System.identityHashCode(sally));
		System.out.println("Cloned Sally hashcode: \t" + System.identityHashCode(clonedSally));
	}
}
