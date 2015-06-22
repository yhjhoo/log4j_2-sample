package prince;

import static org.junit.Assert.*;

import org.junit.Test;

import prince.service.MyService;

/**
 * @author yhjhoo
 * @since 1.0
 * date : 3 Jan, 2015
 *
 */

public class MyAppTest {

	@Test
	public void testTest() {
		MyApp my = new MyApp();
		my.test();
		
		MyService service = new MyService();
		service.testLog();
	}

}
