package fun.pxyc.designpattern.ds_02_command;

public class PhonePlayCommand implements ICommand{
    private Phone phone;

    PhonePlayCommand(Phone phone){
        this.phone = phone;
    }
    public void execute(){
        phone.playGames();
    }
}
