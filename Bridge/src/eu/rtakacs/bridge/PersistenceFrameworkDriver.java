package eu.rtakacs.bridge;

public class PersistenceFrameworkDriver {

	public static void main(String[] args) {
		PersistenceImplementor implementor = null;
		
		boolean dbDriverExists = true;
		
		if(dbDriverExists){
			implementor = new DatabasePersistenceImplementor();
		} else {
			implementor = new FileSystemPersistenceImplementor();
		}
		
		Persistence persistenceApi = new PersistenceImpl(implementor);
		String objId = "123456";
		Object obj = persistenceApi.findById(objId);
		// do changes to the object
		persistenceApi.persist(obj);
		
		//change implementor
		persistenceApi = new PersistenceImpl(new FileSystemPersistenceImplementor());
		persistenceApi.deleteById(objId);
	}

}
