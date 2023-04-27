package fun.pxyc.designpattern.ds_08_chainofresponsibility.logger;

import fun.pxyc.designpattern.ds_08_chainofresponsibility.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {


    public ConsoleLogger(int level) {
        this.LEVEL = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger  " + message);
    }
}
