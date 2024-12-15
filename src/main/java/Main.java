public class Main {	
	
	public static void main(String[] args) {
		int [] a = {4,9,3,8};
		Node<Integer> x = buildList(a);
		ex2c(x);
	}
	
	public static void ex2a(Node<Integer> p) {
		while ( p != null) {
			System.out.println(p.getValue());
			p = p.getNext();
		}
	}
	
	public static void ex2b(Node<Integer> p) {
		if (p != null) {
			System.out.println(p.getValue());
			ex2b(p.getNext());
		}
	}
	
	public static void ex2c(Node<Integer> p) {
		if (p != null) {
			ex2c(p.getNext());
			System.out.println(p.getValue());
		}
	}
	
	public static Node<Integer> buildList(int[] a) {
		Node<Integer> h = new Node<Integer>(-1);
		Node<Integer> p = h;
		Node<Integer> x;
		for (int i = 0; i < a.length; i++) {
			x = new Node<Integer>(a[i]);
			p.setNext(x);
			p = p.getNext();
		}
		return h.getNext();
	}
	
	public static Node<Integer> delSingle(Node<Integer> h, int target) {
		h = new Node<Integer>(-1, h);
		Node<Integer> p = h;
		boolean done = false;
		while (!done && p.hasNext()) {
			if (p.getNext().getValue() == target) {
				p.setNext(p.getNext().getNext());
				done = true;
			} else {
				p = p.getNext();
			}
		}
		return h.getNext();
	}
	
}