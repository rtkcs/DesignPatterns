package eu.rtakacs.bridge;

public class PersistenceImpl implements Persistence {
	
	private PersistenceImplementor implementor = null;
	
	public PersistenceImpl(PersistenceImplementor imp){
		this.implementor = imp;
	}
	
	@Override
	public String persist(Object object) {
		Long objectId = this.implementor.saveObject(object);
		return Long.toString(objectId);
	}

	@Override
	public Object findById(String objectId) {
		return this.implementor.getObject(Long.parseLong(objectId));
	}

	@Override
	public void deleteById(String objectId) {
		this.implementor.deleteObject(Long.parseLong(objectId));
	}

}
