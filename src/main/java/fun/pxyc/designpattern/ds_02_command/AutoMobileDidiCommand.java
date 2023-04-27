package fun.pxyc.designpattern.ds_02_command;

public class AutoMobileDidiCommand implements ICommand{
    private AutoMobile autoMobile;

    AutoMobileDidiCommand(AutoMobile autoMobile){
        this.autoMobile = autoMobile;
    }
    public void execute(){
        autoMobile.didi();
    }
}
