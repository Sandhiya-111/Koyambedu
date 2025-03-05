package Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logger {
    private final static Logger log= LoggerFactory.getLogger(logger.class);
    String message;

        public void infoLog (String message)
        {
            log.info(message);
        }


}
