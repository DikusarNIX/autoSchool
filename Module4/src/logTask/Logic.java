package logTask;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Logic {

    private static final Logger logger = LogManager.getLogger(Logic.class);

    public static void first() {
        logger.info("Entering first method.");
        System.out.println("first method is called");
        second();
    }

    private static void second() {
        logger.info("Entering second method.");
        System.out.println("second method is called");
    }
}
