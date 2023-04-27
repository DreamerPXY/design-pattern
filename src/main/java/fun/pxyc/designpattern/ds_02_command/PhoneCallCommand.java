package fun.pxyc.designpattern.ds_02_command;

public class PhoneCallCommand implements ICommand{
    private Phone phone;

    PhoneCallCommand(Phone phone){
        this.phone = phone;
    }
    public void execute(){
        phone.call();
    }
}
