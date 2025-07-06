package designPatterns.behavioralPattern.ChainOfResponsibility;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    void log(int logLevel, String str) {
        if(logLevel == 3) {
            System.out.println("ERROR["+ this +"]: " + str);
        }
        else {
            super.log(logLevel,str);
        }
    }
}
