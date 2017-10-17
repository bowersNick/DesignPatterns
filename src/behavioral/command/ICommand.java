package behavioral.command;

public interface ICommand {
    void execute();
    void unexecute();
    boolean isReversible();
}
