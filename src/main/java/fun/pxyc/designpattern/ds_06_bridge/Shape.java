package fun.pxyc.designpattern.ds_06_bridge;

public abstract class Shape{
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
