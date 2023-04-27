package fun.pxyc.designpattern.ds_04_decorator;

import fun.pxyc.designpattern.ds_04_decorator.equip.ShoesEquip;
import fun.pxyc.designpattern.ds_04_decorator.gem.BlueGemEquipDecorator;
import fun.pxyc.designpattern.ds_04_decorator.gem.RedGemEquipDecorator;
import fun.pxyc.designpattern.ds_04_decorator.gem.YellowGemEquipDecorator;

public class TestMain {

    public static void main(String[] args) {
        //一个装饰了黄色宝石和两个红色宝石和一个蓝色宝石的鞋子 具有多少攻击力啊？
        IEquip iEquip = new YellowGemEquipDecorator(new RedGemEquipDecorator(new RedGemEquipDecorator(new BlueGemEquipDecorator(new ShoesEquip()))));

        String description = iEquip.description();
        System.out.println("description:"+description);
        int i = iEquip.caculateAttack();
        System.out.println("当前攻击力:"+i);
    }
}
