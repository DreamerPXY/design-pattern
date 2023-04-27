package fun.pxyc.designpattern.ds_05_template;

import fun.pxyc.designpattern.ds_05_template.worker.CTOWorker;
import fun.pxyc.designpattern.ds_05_template.worker.HRWorker;
import fun.pxyc.designpattern.ds_05_template.worker.ITWorker;

public class TestMain {

    public static void main(String[] args) {

        ITWorker itWorker = new ITWorker("景彬");
        itWorker.workOneDay();
        HRWorker hrWorker = new HRWorker("莉莉姐");
        hrWorker.workOneDay();
        CTOWorker ctoWorker = new CTOWorker("远哥");
        ctoWorker.workOneDay();

    }
}
