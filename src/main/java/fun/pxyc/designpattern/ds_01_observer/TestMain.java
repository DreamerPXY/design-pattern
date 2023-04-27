package fun.pxyc.designpattern.ds_01_observer;

public class TestMain {

    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Subject4D subject4D = new Subject4D();
        Subject3D subject3D = new Subject3D();

        subject3D.addObserver(observer1);
        subject3D.addObserver(observer2);

        subject4D.addObserver(observer1);
        subject4D.addObserver(observer2);

        subject3D.setMsg("is a 3d message coming....");
        subject4D.setMsg("is a 4d message coming....");
    }
}
