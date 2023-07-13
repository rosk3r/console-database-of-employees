package command;

public class CloseCommand implements Command {

    @Override
    public void execute(){
        System.exit(0);
    }

}
