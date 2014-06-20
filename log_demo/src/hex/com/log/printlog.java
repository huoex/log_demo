package hex.com.log;

import org.apache.log4j.Logger;


public class printlog {
	private static final Logger LOGGER = Logger.getLogger("hex.com.log.printlog");
	public static void errlog(){
		LOGGER.debug("BB");
	}
	
	public static void infolog(){
		LOGGER.info("info");
	}
	
	public static void tt(){
		if(LOGGER.isDebugEnabled()){
			LOGGER.debug("bug！");
		}
		if(LOGGER.isInfoEnabled()){
			LOGGER.info("info!");
		}
	}
	
}
