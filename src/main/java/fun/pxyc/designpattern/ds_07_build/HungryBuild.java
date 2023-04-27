package fun.pxyc.designpattern.ds_07_build;

public class HungryBuild {

    public volatile static HungryBuild Instance = null;

    public HungryBuild getInstance(){
        if (Instance == null){
            synchronized (HungryBuild.class){
                if (Instance == null){
                    Instance = new HungryBuild();
                }
            }
        }
        return Instance;
    }
}
