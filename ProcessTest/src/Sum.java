import org.junit.Assert;
import org.junit.Test;


public class Sum {
	
	@Test
	public void testMethodSum() {
		Assert.assertTrue((7 == sum(1, 3)));
	}
	
	//...별로임
	public double sum(int startNum, int target) {
		double result = startNum;
		for (int i = 1; i < target; i++) {
			result += i;
		}
		return result;
	}
}
