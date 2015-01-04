package prince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author yhjhoo
 * @since 1.0
 * date : 3 Jan, 2015
 *
 */

public class MyApp {
	private static Log log = LogFactory.getLog(MyApp.class);
	
	public void test(){
		log.debug("debug: test");
		
		log.info("info: test");
		
		log.warn("warn: test");
		
		log.error("error: test");
		
		log.fatal("fatal: test");
	}
}
