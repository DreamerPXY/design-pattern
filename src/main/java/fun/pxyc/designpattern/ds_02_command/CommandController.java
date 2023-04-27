package fun.pxyc.designpattern.ds_02_command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandController {

    private static Map<String,ICommand> commandMap = new HashMap<>();

    public void executeCommand(String commandLine){
        ICommand iCommand = commandMap.get(commandLine);
        if (iCommand != null){
            iCommand.execute();
        }
    }

    public void addCommand(String commandLine,ICommand command){
        commandMap.put(commandLine,command);
    }
}
