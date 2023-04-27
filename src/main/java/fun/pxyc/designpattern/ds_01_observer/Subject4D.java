package fun.pxyc.designpattern.ds_01_observer;

import java.util.Observable;

public class Subject4D extends Observable {

    private String msg = "";

    public String getMsg() {
        return msg;
    }
    public void setMsg(String message){
        this.msg = message;
        setChanged();
        notifyObservers();
    }
}
