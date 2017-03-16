package eu.rtakacs.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongGroup extends SongComponent {

	private List<SongComponent> components = new ArrayList<>();
	private String groupName;
	private String groupDescription;

	public SongGroup(String groupName, String groupDescription) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	@Override
	public void add(SongComponent component) {
		this.components.add(component);
	}

	@Override
	public void remove(SongComponent component) {
		this.components.remove(component);
	}

	@Override
	public SongComponent getComponent(int index) {
		return this.getComponent(index);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.groupName + " " + this.groupDescription + "\r\n");

		Iterator<SongComponent> it = this.components.iterator();
		SongComponent component = null;

		while (it.hasNext()) {
			component = it.next();
			sb.append(component.toString());
			sb.append(", ");
		}
		return sb.toString();
	}
}
