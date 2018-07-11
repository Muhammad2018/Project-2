package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Addtest {

	@Test
	public void Addtest() {
		MyjunitClass junit = new MyjunitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result);

	}

}
