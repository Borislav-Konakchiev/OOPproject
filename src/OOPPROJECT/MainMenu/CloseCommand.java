package src.OOPPROJECT.MainMenu;

public class CloseCommand implements Command{
    public void execute(String[] args) {
        CommandMenu.setCurrentFile(null);
        System.out.println("Successfully closed the current file.");
    }
}
