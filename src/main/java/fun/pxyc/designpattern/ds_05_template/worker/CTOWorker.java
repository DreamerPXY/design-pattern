package fun.pxyc.designpattern.ds_05_template.worker;

import fun.pxyc.designpattern.ds_05_template.Worker;

public class CTOWorker extends Worker {

    public CTOWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work"+"---" + name + ", 开会 - 出KPI - 检查进度");
    }
}
