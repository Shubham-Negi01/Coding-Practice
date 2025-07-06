package designPatterns.behavioralPattern.ChainOfResponsibility;

public class DebugLogger extends Logger{
    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    void log(int logLevel, String str) {
        if(logLevel == 2) {
            System.out.println("DEBUG["+ this +"]: " + str);
        }
        else {
            nextLogger.log(logLevel, str);
        }
    }
}
