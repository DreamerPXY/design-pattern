package fun.pxyc.designpattern.ds_04_decorator.gem;

import fun.pxyc.designpattern.ds_04_decorator.IEquip;

public class YellowGemEquipDecorator implements IEquipDecorator{
    private IEquip equip;//具体装备

    public YellowGemEquipDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int caculateAttack() {
        return 5 + equip.caculateAttack();
    }

    @Override
    public String description() {
        return equip.description() + "  黄宝石装饰";
    }
}
