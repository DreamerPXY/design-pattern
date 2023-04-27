package fun.pxyc.designpattern.ds_08_chainofresponsibility.logger;

import fun.pxyc.designpattern.ds_08_chainofresponsibility.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.LEVEL = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger  " + message);
    }
}
