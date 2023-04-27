package fun.pxyc.designpattern.ds_08_chainofresponsibility;

import fun.pxyc.designpattern.ds_08_chainofresponsibility.logger.ConsoleLogger;
import fun.pxyc.designpattern.ds_08_chainofresponsibility.logger.ErrorLogger;
import fun.pxyc.designpattern.ds_08_chainofresponsibility.logger.FileLogger;

public class TestMain {

    public static void main(String[] args) {

        getLoggerChain().loggerMessage(AbstractLogger.INFO,"Info logger");
        System.out.println("--------------------------------------------------");
        getLoggerChain().loggerMessage(AbstractLogger.ERROR,"Error logger");
        System.out.println("--------------------------------------------------");
        getLoggerChain().loggerMessage(AbstractLogger.DEBUG,"Debug logger");

    }
    public static AbstractLogger getLoggerChain(){
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
