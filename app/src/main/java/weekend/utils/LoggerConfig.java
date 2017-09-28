package weekend.utils;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.io.FileInputStream;
import java.util.logging.Level;

/**
 * Created by HP on 29/09/2017.
 */

public class LoggerConfig {
    private static final LogManager logManager = LogManager.getLogManager();
    private static final Logger LOGGER = Logger.getLogger("configLogger");

    static {
        try{
            logManager.readConfiguration(new FileInputStream("./trackandspend.properties"));
        }
        catch(Exception ex){
            LOGGER.log(Level.SEVERE, "Error in loading configuration",ex);
        }
    }
}
