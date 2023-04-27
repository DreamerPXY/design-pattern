package fun.pxyc.designpattern.ds_04_decorator.gem;

import fun.pxyc.designpattern.ds_04_decorator.IEquip;

public class RedGemEquipDecorator implements IEquipDecorator {

    private IEquip equip;//具体装备

    public RedGemEquipDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 5 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "  红宝石装饰";
    }
}
