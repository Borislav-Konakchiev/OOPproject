package src.OOPPROJECT.MainMenu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class OpenCommand implements Command {
    public void execute(String[] args) {
        String filePath = args[0];
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("New file created: " + filePath);
            } else {
                System.out.println("File already exists: " + filePath);
            }
            CommandMenu.setCurrentFile(filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
