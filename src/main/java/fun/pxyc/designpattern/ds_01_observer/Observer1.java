package fun.pxyc.designpattern.ds_01_observer;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements  Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Subject3D) {
            Subject3D subjectFor3d = (Subject3D) o;
            System.out.println("I am Obsever 1 Subject3D's msg -- >" + subjectFor3d.getMsg());
        }

        if (o instanceof Subject4D) {
            Subject4D subjectForSSQ = (Subject4D) o;
            System.out.println("I am Obsever 1 Subject4D's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
