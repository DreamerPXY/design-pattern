package fun.pxyc.designpattern.ds_03_adapter;

public class TestMain {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5PowerAdapter v5Power = new V5PowerAdapter(new V220Power());
        mobile.charge(v5Power);
    }
}
