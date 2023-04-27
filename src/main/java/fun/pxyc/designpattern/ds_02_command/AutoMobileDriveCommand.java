package fun.pxyc.designpattern.ds_02_command;

public class AutoMobileDriveCommand implements ICommand{
    private AutoMobile autoMobile;

    AutoMobileDriveCommand(AutoMobile autoMobile){
        this.autoMobile = autoMobile;
    }
    public void execute(){
        autoMobile.drive();
    }
}
