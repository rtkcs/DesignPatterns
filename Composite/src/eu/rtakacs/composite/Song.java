package eu.rtakacs.composite;

public class Song extends SongComponent {

	private String songName;
	private String bandName;
	private int releaseYear;

	public Song(String songName, String bandName, int releaseYear) {
		this.songName = songName;
		this.bandName = bandName;
		this.releaseYear = releaseYear;
	}

	@Override
	public String getSongName() {
		return this.songName;
	}

	@Override
	public String getBandName() {
		return this.bandName;
	}

	@Override
	public int getReleaseYear() {
		return this.releaseYear;
	}

	@Override
	public String toString() {
		return "Song [songName=" + songName + ", bandName=" + bandName + ", releaseYear=" + releaseYear + "]";
	}
}
