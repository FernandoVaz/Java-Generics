import java.util.ArrayList;

class Generics {
	
	public static void main(String[] args) {

		// ArrayList of objects, in order to access the Strings added
		// we must cast the names.get() into a String.
		// This is problematic since we can get type error at runtime
		// Generics helps errors happen during compilation time.

		ArrayList names = new ArrayList();

		names.add("NameOne");
		names.add("Name1");
		names.add("Name2");

		String myName = (String) names.get(0);
	}
}