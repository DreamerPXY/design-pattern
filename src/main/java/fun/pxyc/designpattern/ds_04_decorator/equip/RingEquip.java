package fun.pxyc.designpattern.ds_04_decorator.equip;

import fun.pxyc.designpattern.ds_04_decorator.IEquip;

public class RingEquip implements IEquip {

    @Override
    public int caculateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }

}
