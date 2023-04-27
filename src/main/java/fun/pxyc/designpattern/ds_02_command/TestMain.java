package fun.pxyc.designpattern.ds_02_command;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        CommandController commandController = new CommandController();

        AutoMobile autoMobile = new AutoMobile();
        AutoMobileDidiCommand didiCommand = new AutoMobileDidiCommand(autoMobile);
        AutoMobileDriveCommand driveCommand = new AutoMobileDriveCommand(autoMobile);
        commandController.addCommand("didi",didiCommand);
        commandController.addCommand("drive",driveCommand);


        Phone phone = new Phone();
        PhonePlayCommand phonePlayCommand = new PhonePlayCommand(phone);
        PhoneCallCommand phoneCallCommand = new PhoneCallCommand(phone);
        commandController.addCommand("play",phonePlayCommand);
        commandController.addCommand("call",phoneCallCommand);


        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String commandLine = scanner.nextLine();
            commandController.executeCommand(commandLine);
        }

    }
}
