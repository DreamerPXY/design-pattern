package fun.pxyc.designpattern.ds_03_adapter;

public class V220Power implements IPower{

    @Override
    public int doCharge() {
        System.out.println("i can give you 220V power");
        return 220;
    }
}
