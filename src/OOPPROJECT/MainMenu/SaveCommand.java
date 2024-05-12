package src.OOPPROJECT.MainMenu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class SaveCommand implements Command{
    public void execute(String[] args) {
        String currentFile = CommandMenu.getCurrentFile();
        if (currentFile == null) {
            System.out.println("Error: No file is currently opened.");
            return;
        }

        try (FileWriter writer = new FileWriter(currentFile)) {
            writer.write("Changes saved to " + currentFile);
            System.out.println("Successfully saved " + currentFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
