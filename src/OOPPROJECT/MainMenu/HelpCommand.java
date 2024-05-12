package src.OOPPROJECT.MainMenu;

public class HelpCommand implements Command{
    public void execute(String[] args) {
        System.out.println("The following commands are supported:");
        System.out.println("open <file>\t - opens <file>");
        System.out.println("close\t\t - closes currently opened file");
        System.out.println("save\t\t - saves the currently open file");
        System.out.println("saveas <file> - saves the currently open file in <file>");
        System.out.println("help\t\t - prints this information");
        System.out.println("exit\t\t - exits the program");
    }
}
