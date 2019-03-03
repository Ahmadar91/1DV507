package aa224fn_assign4.binheap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinIntHeapTest {

	@Test
	public void testSize() {
		BinaryIntHeap bih = new BinaryIntHeap();
		assertEquals(0, bih.size());

		for (int i = 0; i < 20; i++) {
			assertEquals(i, bih.size());
			bih.insert(i);
		}
		assertEquals(20, bih.size());
	}

	@Test
	public void testIsEmpty() {

		BinaryIntHeap bih = new BinaryIntHeap();
		assertEquals(true, bih.isEmpty());
	}

	@Test
	public void testIsEmptyAfterPull() {

		BinaryIntHeap bih = new BinaryIntHeap();

		for (int i = 0; i <= 20; i++) {
			bih.insert(i);
		}

		for (int i = 0; i <= 20; i++) {
			bih.pullHighest();
		}
		assertEquals(true, bih.isEmpty());
	}

	@Test
	public void testPullHighest() throws IllegalArgumentException {
		BinaryIntHeap bih = new BinaryIntHeap();

		for (int i = 0; i < 20; i++) {
			bih.insert(i);
		}

		for (int i = 19; i >= 0; i--) {
			assertEquals(i, bih.pullHighest());
		}
		assertEquals(0,bih.size());
	}

	@Test
	public void testInsert() {
		BinaryIntHeap bih = new BinaryIntHeap();
		for (int i = 0; i < 20; i++) {
			bih.insert(i);
			}
		assertEquals(20,bih.size());
	}

	@Test
	public void testToString() {
		BinaryIntHeap bih = new BinaryIntHeap();
		for (int i = 1; i < 20; i++) {
				bih.insert(i);
		}
		String str = bih.toString();
		assertEquals(str,bih.toString());
		
		}
}
