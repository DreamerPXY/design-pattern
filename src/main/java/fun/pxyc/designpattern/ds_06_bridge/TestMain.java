package fun.pxyc.designpattern.ds_06_bridge;

public class TestMain {

    //桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
    //这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
    //主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
    public static void main(String[] args) {
        // 画红圆
        Circle circle = new Circle(10, 10, 100, new RedCircle());
        circle.draw();
        // 画绿圆
        Circle circle2 = new Circle(20, 20, 100, new GreenCircle());
        circle2.draw();
    }
}
