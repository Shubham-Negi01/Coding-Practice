package designPatterns.behavioralPattern.ChainOfResponsibility;

public class LoggerDriver {

    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        System.out.println(logger);

        logger.info("This is info logger");
        logger.error("This is error logger");
        logger.debug("This is debug logger");
    }

}
