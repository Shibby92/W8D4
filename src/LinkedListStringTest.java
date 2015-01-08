public class LinkedListStringTest {

	public static void main(String[] args) {
		LinkedListString test = new LinkedListString();
		test.add("Haris");
		test.add("Selma");
		test.add("Nermin");
		test.add("HUKAČAKA");
		String name;
		name = TextIO.getlnString();
		while (!name.equals("kraj")) {

			test.add(name);
			name = TextIO.getlnString();
		}
		test.printList();
String [] stringArray=test.toArray(test);
for(String meh:stringArray)
	System.out.println(meh);
	}

}
