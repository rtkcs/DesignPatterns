package eu.rtakacs.builder2;

/**
 * Client
 * 
 * @author rtakacsux
 *
 */
public class Client {
	void createASCIIText(Document doc){
		ASCIIConverter asciiBuilder = new ASCIIConverter();
		RTFReader rtfReader = new RTFReader(asciiBuilder);
		rtfReader.parseRTF(doc);
		ASCIIText asciiText = asciiBuilder.getResult();
		System.out.println( "asciiText" + asciiText.toString());
	}
	
	public static void main(String args[]){
		Client client = new Client();
		Document doc = new Document();
		client.createASCIIText(doc);
	}
}
