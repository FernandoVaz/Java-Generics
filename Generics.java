import java.util.ArrayList;

class Generics {

	public static void main(String[] args) {

		switch(args[0]) {
			case "1":
				genericsExample1();
				break;
			case "2":
				genericsExample2();
				break;
			default:
				break;
		}
	}



	// ArrayList of objects, in order to access the Strings added
	// we must cast the names.get() into a String.
	// This is problematic since we can get type error at runtime
	// Generics helps errors happen during compilation time.
	public static void genericsExample1() {
		
		ArrayList names = new ArrayList();

		names.add("NameOne");
		names.add("Name1");
		names.add("Name2");

		String myName = (String) names.get(0);
		System.out.println(myName);
	}


	// Unboxing and Autoboxing, the concepts of Wrapping primitives
	public static void genericsExample2() {

	}
}