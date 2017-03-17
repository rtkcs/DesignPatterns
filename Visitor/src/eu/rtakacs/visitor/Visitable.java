package eu.rtakacs.visitor;

public interface Visitable {
	
	public double accept(Visitor visitor);
}
