package mx.edev.scala.classes.definition;

public class JavaPerson {
	private final String fullname;

	public JavaPerson(String name, String lastname) {
		this.fullname = String.format("Java: %s %s", name, lastname);
	}

	public JavaPerson(String name) {
		this(name, "");
	}
	public String getFullname() {
		return fullname;
	}
}