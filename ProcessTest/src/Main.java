import org.junit.Assert;
import org.junit.Test;


public class Main {

	
	@Test
	public void booleanTest() {
		boolean r = false;
		Assert.assertFalse(r);
	}
	
	@Test
	public void sumTest() {
		int a = 10;
		int b = 20;
		org.junit.Assert.assertTrue(a == (b - 10));
	}

}
