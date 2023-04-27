package fun.pxyc.designpattern.ds_03_adapter;

public class Mobile {

    public void charge(IPower v5Power){
        int i = v5Power.doCharge();
        System.out.println(String.format("i got %dV charge...",i));
    }
}
