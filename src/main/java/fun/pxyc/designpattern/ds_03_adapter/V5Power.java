package fun.pxyc.designpattern.ds_03_adapter;

public class V5Power implements IPower {
    @Override
    public int doCharge() {
        System.out.println("i can give you 5V power");
        return 5;
    }
}
