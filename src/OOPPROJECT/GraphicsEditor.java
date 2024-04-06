package src.OOPPROJECT;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GraphicsEditor {
    private String currentFile;

    public void open(String filePath) {
        try {
            // Load the content of the file
            // Replace this with your file parsing logic
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            // Simulate reading the file content
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            this.currentFile = filePath;
            System.out.println("Successfully opened " + filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void close() {
        this.currentFile = null;
        System.out.println("Successfully closed current file");
    }

    public void save() {
        if (this.currentFile == null) {
            System.out.println("Error: No file is currently opened");
            return;
        }
        try {
            // Save changes to the current file
            // Replace this with your save logic
            FileWriter writer = new FileWriter(this.currentFile);
            // Simulate writing changes to the file
            writer.write("Changes saved to " + this.currentFile);
            writer.close();
            System.out.println("Successfully saved " + this.currentFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void saveAs(String filePath) {
        try {
            // Save changes to the specified file
            FileWriter writer = new FileWriter(filePath);
            // Simulate writing changes to the file
            writer.write("Changes saved to " + filePath);
            writer.close();
            System.out.println("Successfully saved as " + filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showMenu() {
        System.out.println("The following commands are supported:");
        System.out.println("open <file>");
        System.out.println("close");
        System.out.println("save");
        System.out.println("saveas <file>");
        System.out.println("exit");
        // Additional help content can be added here
    }
}

