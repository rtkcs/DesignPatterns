package eu.rtakacs.iterator;

public class BooksCollectionTest {
	
	public static void main(String[] args){
		BooksCollection bc = new BooksCollection();
		IIterator it = bc.createIterator();
		while(it.hasNext())
			System.out.println(it.next().toString());
	}
}
