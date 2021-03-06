import org.junit.Assert;
import org.junit.Test;

public class FatorialTest {
	@Test
	public void calcFatorialTest() {
		Fatorial fatorial = new Fatorial();

		// equals asserts
		Assert.assertEquals(120, fatorial.calc(5));
		Assert.assertEquals(24, fatorial.calc(4));
		Assert.assertEquals(720, fatorial.calc(6));

		// not equals asserts
		Assert.assertNotEquals(1, fatorial.calc(6));
		Assert.assertNotEquals(720, fatorial.calc(20));
		Assert.assertNotEquals(0, fatorial.calc(0));
	}

}
