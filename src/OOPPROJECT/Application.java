package src.OOPPROJECT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        GraphicsEditor editor = new GraphicsEditor();
        Scanner scanner = new Scanner(System.in);

        Map<String, Runnable> commands = new HashMap<>();
        commands.put("open", () -> {
            System.out.print("Enter file path: ");
            if (scanner.hasNext()) {
                editor.open(scanner.next());
            }
        });
        commands.put("close", editor::close);
        commands.put("save", editor::save);
        commands.put("saveas", () -> {
            System.out.print("Enter file path: ");
            if (scanner.hasNext()) {
                editor.saveAs(scanner.next());
            }
        });
        commands.put("showmenu", editor::showMenu);
        commands.put("exit", () -> {
            System.out.println("Exiting the program...");
            scanner.close();
            System.exit(0);
        });

        // Show menu
        editor.showMenu();

        while (true) {
            System.out.print("> ");
            String input = scanner.next();
            if (commands.containsKey(input)) {
                commands.get(input).run();
            } else {
                System.out.println("Error: Unknown command. Type 'showmenu' for assistance.");
            }
        }
    }
}
