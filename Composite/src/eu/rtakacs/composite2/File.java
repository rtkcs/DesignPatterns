package eu.rtakacs.composite2;

public class File implements AbstractFile {

	private String m_name;
	
	public File(String name) {
		m_name = name;
	}

	public void ls() {
		System.out.println(CompositeDemo.g_indent + m_name);
	}
}
