package aa224fn_assign4.binheap;

public class BinaryIntHeapMain {

	public static void main(String[] args) {
		BinaryIntHeap bih = new BinaryIntHeap();
		
		System.out.println("Size: " + bih.size());
		System.out.println("Empty: " + bih.isEmpty());

		for (int i = 0; i < 10; i++) {
			bih.insert(i);
			}

			
		System.out.println("Size: " + bih.size());
		System.out.println(bih.toString());
		System.out.println("Empty: " + bih.isEmpty());
		System.out.println("Pull highest: " + bih.pullHighest());
		System.out.println("Size: " + bih.size());
		System.out.println(bih.toString());

	}

}
