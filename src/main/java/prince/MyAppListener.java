package prince;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Application Lifecycle Listener implementation class MyAppListener
 *
 */
public class MyAppListener implements HttpSessionListener, ServletContextListener{

	private Log log = LogFactory.getLog(this.getClass());
	
    /**
     * Default constructor. 
     */
    public MyAppListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
        log.info("session Created!");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	log.info("session Destroyed!");
    }

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		log.info("contextDestroyed!");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		log.info("contextInitialized!");
	}
	
}
