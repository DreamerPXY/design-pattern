package fun.pxyc.designpattern.ds_08_chainofresponsibility.logger;

import fun.pxyc.designpattern.ds_08_chainofresponsibility.AbstractLogger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.LEVEL = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger  " + message);
    }
}
