package eu.rtakacs.composite;

public class DiscJockey {
	SongComponent songList;

	public DiscJockey(SongComponent component) {
		this.songList = component;
	}

	public void displaySongList() {
		System.out.println(this.songList.toString());
	}
}
