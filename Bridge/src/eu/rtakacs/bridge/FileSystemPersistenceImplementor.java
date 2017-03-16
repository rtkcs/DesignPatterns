package eu.rtakacs.bridge;

import java.io.File;

public class FileSystemPersistenceImplementor implements PersistenceImplementor {

	@Override
	public long saveObject(Object object) {
		System.out.println("Locate or create new file, save object");
		return System.currentTimeMillis();
	}

	@Override
	public void deleteObject(long objectId) {
		System.out.println("Locate and delete file");
	}

	@Override
	public Object getObject(long objectId) {
		System.out.println("Locate file, get object from file");
		return new Object();
	}

}
