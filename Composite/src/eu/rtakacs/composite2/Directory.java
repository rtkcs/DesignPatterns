package eu.rtakacs.composite2;

import java.util.ArrayList;

public class Directory implements AbstractFile {

	private String m_name;
	private ArrayList<AbstractFile> m_files = new ArrayList<>();
	
	public Directory(String name) {
		m_name = name;
	}

	public void add(AbstractFile obj) {
		m_files.add(obj);
	}

	public void ls() {
		System.out.println(CompositeDemo.g_indent + m_name);
		CompositeDemo.g_indent.append("   ");
		for (int i = 0; i < m_files.size(); ++i) {
			// Leverage the "lowest common denominator"
			AbstractFile obj = m_files.get(i);
			obj.ls();
		}
		CompositeDemo.g_indent.setLength(CompositeDemo.g_indent.length() - 3);
	}
}
