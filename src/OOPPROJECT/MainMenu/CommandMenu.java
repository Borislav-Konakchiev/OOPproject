package src.OOPPROJECT.MainMenu;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class CommandMenu {
    private static String currentFile;
    private static final Map<String, Command> commands = new HashMap<>();

    static {
        commands.put("open", new OpenCommand());
        commands.put("close", new CloseCommand());
        commands.put("save", new SaveCommand());
        commands.put("saveas", new SaveAsCommand());
        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());
    }

    public static void setCurrentFile(String filePath) {
        currentFile = filePath;
    }

    public static String getCurrentFile() {
        return currentFile;
    }

    public void executeCommand(String input) {
        String[] parts = input.split("\\s+");
        String commandName = parts[0].toLowerCase();

        Command command = commands.get(commandName);
        if (command != null) {
            if (parts.length > 1) {
                String[] arguments = new String[parts.length - 1];
                System.arraycopy(parts, 1, arguments, 0, parts.length - 1);
                command.execute(arguments);
            } else {
                command.execute(new String[0]);
            }
        } else {
            System.out.println("Error: Unknown command. Type 'help' for assistance.");
        }
    }
}
