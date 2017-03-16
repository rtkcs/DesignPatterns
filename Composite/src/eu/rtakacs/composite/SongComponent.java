package eu.rtakacs.composite;

public abstract class SongComponent {

	// private String songName = "";
	// private String bandName = "";
	// private int releaseYear = 0;

	public void add(SongComponent component) {
		throw new UnsupportedOperationException();
	}

	public void remove(SongComponent component) {
		throw new UnsupportedOperationException();
	}

	public SongComponent getComponent(int index) {
		throw new UnsupportedOperationException();
	}

	public String getSongName() {
		throw new UnsupportedOperationException();
	}

	public String getBandName() {
		throw new UnsupportedOperationException();
	}

	public int getReleaseYear() {
		throw new UnsupportedOperationException();
	}

}
