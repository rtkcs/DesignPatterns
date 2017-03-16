package eu.rtakacs.bridge;

public class DatabasePersistenceImplementor implements PersistenceImplementor {

	@Override
	public long saveObject(Object object) {
		System.out.println("Open DB connection, create record in DB from object fields");
		return 0;
	}

	@Override
	public void deleteObject(long objectId) {
		System.out.println("Open DB connection, remove record");
	}

	@Override
	public Object getObject(long objectId) {
		System.out.println("Open DB connection, read record, create object from record");
		return new Object();
	}

}
