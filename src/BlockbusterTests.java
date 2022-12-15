import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;

class BlockbusterTests {

	@Test
	void testDVD() {
		Movie d = new DVD("test", 5);
		String actual = "test" + 5;
		String expected = d.getTitle() + d.getRunTime();
		assertEquals(actual, expected);
	}
	
	@Test
	void testVHS() {
		Movie v = new DVD("test", 5);
		String actual = "test" + 5;
		String expected = v.getTitle() + v.getRunTime();
		assertEquals(actual, expected);
	}
	
	@Test
	void testPlay() {
		Movie v = new VHS("test", 5);
		v.play();
		assertEquals(1, v.getCurrentTime());
	}
	
//	@Test
//	void testRewind() {
//		Movie v = new VHS("test", 5);
//		
//	}

}
