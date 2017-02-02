import org.junit.Assert;
import org.junit.Test;


public class Sum {
	
	
	
	@Test
	public void testMethodSum() {
		Assert.assertTrue((4 == sum(1, 3)));
	}
	
	//...별로임
	public int sum(int startNum, int target) {
		int result = startNum;
		for (int i = 1; i < target; i++) {
			result += i;
		}
		return result;
	}
}
