package fun.pxyc.designpattern.ds_06_bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("draw a x:"+x +" y:"+y + " a red circle");
    }
}
