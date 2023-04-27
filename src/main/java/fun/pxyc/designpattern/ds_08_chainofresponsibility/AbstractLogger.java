package fun.pxyc.designpattern.ds_08_chainofresponsibility;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int LEVEL ;

    // 责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void loggerMessage(int level,String message){
        if (level <= LEVEL){
            write(message);
        }
        if (hasNextLogger()){
            nextLogger.loggerMessage(level,message);
        }
    }

    private boolean hasNextLogger() {
        return nextLogger != null;
    }

    protected abstract void write(String message);
}
