package prince.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author yhjhoo
 * @since 1.0
 * date : 22 Jun, 2015
 *
 */

public class MyService {
	private final Log log = LogFactory.getLog(this.getClass());
	
	public void testLog(){
		log.debug("debug: test");
		
		log.info("info: test");
		
		log.trace("trace test");
	}
}
