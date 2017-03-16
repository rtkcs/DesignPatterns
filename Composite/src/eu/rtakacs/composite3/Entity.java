package eu.rtakacs.composite3;

public abstract class Entity {

	protected static StringBuffer indent = new StringBuffer();
	protected static int level = 1;

	public abstract void traverse(int[] levels);

	protected boolean printThisLevel(int[] levels) {
		return true;
//		for (int i = 0; i < levels.length; i++)
//			if (level == levels[i])
//				return true;
//		return false;
	}
}
