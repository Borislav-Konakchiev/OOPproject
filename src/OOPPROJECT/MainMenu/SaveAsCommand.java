package src.OOPPROJECT.MainMenu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class SaveAsCommand implements Command{
    public void execute(String[] args) {
        String filePath = args[0];
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Changes saved to " + filePath);
            System.out.println("Successfully saved as " + filePath);
            CommandMenu.setCurrentFile(filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
