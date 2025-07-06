package designPatterns.behavioralPattern.ChainOfResponsibility;

public class InfoLogger extends Logger{

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    void log(int logLevel, String str) {
        if(logLevel == 1) {
            System.out.println("INFO["+ this +"]: " + str);
        }
        else {
            nextLogger.log(logLevel, str);
        }
    }
}
