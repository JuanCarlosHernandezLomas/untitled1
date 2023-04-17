package org.example.framework.util.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log {

    private static Logger log = LogManager.getLogger(Log.class.getName());

    public static void info(String message){log.info(message);}

    public static void error(String message){log.error(message);}

    public static void fatal(String message){log.fatal(message);}
    public static void warn(String message){log.warn(message);}
}
