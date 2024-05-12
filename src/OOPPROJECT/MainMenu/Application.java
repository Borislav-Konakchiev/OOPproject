package src.OOPPROJECT.MainMenu;

public class Application {
    public static void main(String[] args) {
        CommandMenu menu = new CommandMenu();
        menu.executeCommand("help"); // Display available commands at the beginning

        // Example usage:
        menu.executeCommand("open C:\\Temp\\file.xml");
        menu.executeCommand("close");
        menu.executeCommand("save");
        menu.executeCommand("saveas C:\\Temp\\another file.xml");
        menu.executeCommand("exit");
    }
}
