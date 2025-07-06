package designPatterns.behavioralPattern.ChainOfResponsibility;

public class Logger {

    Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void info(String str) {
        log(1,str);
    }

    public void debug(String str) {
        log(2,str);
    }

    public void error(String str) {
        log(3,str);
    }

    void log(int logLevel, String str) {
        System.out.println("Logger level not present");
    }

}
