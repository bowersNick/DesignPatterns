package behavioral.command;

import java.util.List;

public class Invoker {
    Document aDocument;
    int aPosition;
    String aText;
    CommandManager commandManager;

    public Invoker() {
        aDocument = new Document();
        aPosition = 0;
        aText = "";
        commandManager = CommandManager.getInstance();
        ICommand command = new PasteCommand(aDocument, aPosition, aText);
        commandManager.invokeCommand(command);
    }
}

class CommandManager {
    List<ICommand> undo;
    List<ICommand> history;

    public static CommandManager getInstance() {
        return new CommandManager();
    }

    public void invokeCommand(ICommand iCommand) {

    }
}
