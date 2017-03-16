package eu.rtakacs.composite3;

import java.util.ArrayList;
import java.util.List;

public class Box extends Entity {

	private List<Entity> children = new ArrayList<>();
	private int value;

	public Box(int val) {
		value = val;
	}

	public void add(Entity c) {
		children.add(c);
	}

	@Override
	public void traverse(int[] levels) {
		if (printThisLevel(levels)) {
			System.out.println(indent.toString() + value + " box");
			indent.append("   ");
		}
		level++;
		for (int i = 0; i < children.size(); i++)
			children.get(i).traverse(levels);
		level--;
		if (printThisLevel(levels))
			indent.setLength(indent.length() - 3);

	}

}
