package fun.pxyc.designpattern.ds_03_adapter;

public class V5PowerAdapter implements IPower{
    private V220Power power;

    V5PowerAdapter(V220Power power){
        this.power = power;
    }
    @Override
    public int doCharge() {
        int i = power.doCharge();
        System.out.println("适配器开始一系列的处理....");
        return i - 215;
    }
}
