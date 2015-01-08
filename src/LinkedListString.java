public class LinkedListString implements List {
	private PersonNode head;
	private int size;

	public LinkedListString() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * Node klasa
	 * 
	 * @author harisarifovic
	 *
	 */
	private class PersonNode {
		public String value;
		public PersonNode next;

		public PersonNode(String value) {
			this.value = value;
			this.next = null;
		}
	}

	/**
	 * Dodaje ime na kraj liste
	 * 
	 * @param value
	 *            Ime
	 */
	public void add(String value) {
		PersonNode newNode = new PersonNode(value);
		if (this.head == null) {
			this.head = newNode;
			size++;
			return;
		}
		PersonNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;
	}

	/**
	 * Ispisuje listu (imena)
	 */
	public void printList() {
		PersonNode print = head;
		while (print != null) {
			System.out.println(print.value);
			print = print.next;
		}

	}

	/**
	 * Pretvara listu u niz stringova
	 * 
	 * @param other
	 *            Lista koja se pretvara
	 * @return Niz stringova u koje su vrijednosti clanova liste
	 */
	public String[] toArray(LinkedListString other) {
		String[] array = new String[size];
		PersonNode copy = other.head;
		for (int i = 0; i < array.length; i++) {
			array[i] = copy.value;
			copy = copy.next;
		}
		return array;
	}
}
