package eu.rtakacs.iterator;

public class BooksCollection implements IContainer {
	
	private String m_titles[] = {"Design Patterns", "Enterprise Design Patterns", "Enterprise Integration Patterns"};

	public IIterator createIterator(){
		return new BookIterator();
	}
	
	private class BookIterator implements IIterator{
		
		private int m_position;
		
		@Override
		public boolean hasNext() {
			if(m_position < m_titles.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(this.hasNext())
				return m_titles[m_position++];
			else
				return null;
		}
	}
}
