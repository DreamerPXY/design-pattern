package fun.pxyc.designpattern.ds_04_decorator.gem;

import fun.pxyc.designpattern.ds_04_decorator.IEquip;

public class BlueGemEquipDecorator implements IEquipDecorator {

    private IEquip equip;//具体装备

    public BlueGemEquipDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 15 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "  蓝宝石装饰";
    }
}
