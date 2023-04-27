package fun.pxyc.designpattern.ds_05_template.worker;

import fun.pxyc.designpattern.ds_05_template.Worker;

public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work"+"---" + name + ", 看简历 - 打电话 - 接电话");
    }
}
