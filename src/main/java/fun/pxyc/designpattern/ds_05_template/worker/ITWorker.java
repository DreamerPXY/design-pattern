package fun.pxyc.designpattern.ds_05_template.worker;

import fun.pxyc.designpattern.ds_05_template.Worker;

public class ITWorker extends Worker {
    public ITWorker(String name) {
        super(name);
    }

    /**
     * 重写父类的此方法,使可以查看离开公司时间
     */
    @Override
    public boolean isNeedPrintDate() {
        return true;
    }

    @Override
    public void work() {
        System.out.println("--work" + "---" + name + ", 写程序 - 测bug - 修复bug");
    }
}
