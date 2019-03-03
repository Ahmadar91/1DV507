package aa224fn_assign1.intCollection;

import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {

		ArrayIntList list = new ArrayIntList();

		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		System.out.println("ArrayList : "+list.toString());
		list.remove(1);
		System.out.println("ArrayList after remove operation: "+list.toString());
		list.addAt(22, 2);
		System.out.println("ArrayList after addAt opertation : "+ list.toString());
		System.out.println(+list.get(3));
		System.out.println(list.indexOf(6));
		System.out.println();
		
		System.out.println("Stack: ");
		IntStack stack = new ArrayIntStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		Iterator<Integer> it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Elements after pop and peek:");
		Iterator<Integer> it1 = stack.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());

		}

	}

}
