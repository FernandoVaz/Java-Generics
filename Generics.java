import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Generics {

	public static void main(String[] args) {

		switch(args[0]) {
			case "1":
				genericsExample1();
				break;
			case "2":
				genericsExample2();
				break;
			case "3":
				genericsExample3();
			default:
				break;
		}
	}


	public static void genericsExample1() {
		
		ArrayList names = new ArrayList();

		names.add("NameOne");
		names.add("Name1");
		names.add("Name2");


		System.out.println("\n############# Program description:\n");
		System.out.println("ArrayList of objects, in order to access the Strings added \nwe must cast the names.get() into a String. \nThis is problematic since we can get type error at runtime \nGenerics helps errors happen during compilation time.");
		System.out.println("\n############# Program outputs:\n");
		String myName = (String) names.get(0);
		System.out.println(myName);
	}

	public static void genericsExample2() {

		System.out.println("\n############# Program description:\n");
		System.out.println("Unboxing and Autoboxing, the concepts of Wrapping primitives");
		System.out.println("Wrapper Objects is a way to treat an primitive as an Object");
		System.out.println("Every primitive has an wrapper classes");
		System.out.println("\n############# Program outputs:\n");

		// Autoboxing
		int z = 10;
		Integer a = z;

		// Unboxing
		Integer x = new Integer(10);
		int i = x;

		List<Integer> list = Arrays.asList(10, 20, 30);

	}

	public static void genericsExample3() {

		System.out.println("\n############# Program description:\n");
		System.out.println("Parametized types");
		System.out.println("List<E> is a generic type that takes a E as a type parameter");
		System.out.println("\n############# Program outputs:\n");

		// Autoboxing
		int z = 10;
		Integer a = z;

		// Unboxing
		Integer x = new Integer(10);
		int i = x;

		List<Integer> list = Arrays.asList(10, 20, 30);

	}
}