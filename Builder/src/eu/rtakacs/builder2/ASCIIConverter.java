package eu.rtakacs.builder2;

/**
 * Concrete Builder
 * 
 * @author rtakacsux
 *
 */
public class ASCIIConverter extends TextConverter {
	
	ASCIIText asciiText;
	
	@Override
	void convertCharacter(char c) {
		char asciiChar = new Character(c).charValue();
		asciiText.append(asciiChar);
	}

	@Override
	void convertParagraph() {
	}
	
	ASCIIText getResult(){
		return asciiText;
	}

}
