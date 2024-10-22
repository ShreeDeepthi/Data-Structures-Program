import java.util.Scanner;
import java.util.Stack;

public class DynamicSimplifyPath {
    public String simplifyPath(String path) {
        // Create a stack to hold the directories
        Stack<String> stack = new Stack<>();
        
        // Split the path by '/'
        String[] components = path.split("/");
        
        for (String component : components) {
            // Ignore empty components and current directory '.'
            if (component.isEmpty() || component.equals(".")) {
                continue;
            }
            // Handle parent directory '..'
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); // Go up to the parent directory
                }
            } else {
                // It's a valid directory name, push it onto the stack
                stack.push(component);
            }
        }
        
        // Build the simplified path
        StringBuilder simplifiedPath = new StringBuilder();
        for (String dir : stack) {
            simplifiedPath.append("/").append(dir);
        }
        
        // If the stack is empty, return root directory
        return simplifiedPath.length() == 0 ? "/" : simplifiedPath.toString();
    }

    public static void main(String[] args) {
        DynamicSimplifyPath sp = new DynamicSimplifyPath();
        Scanner scanner = new Scanner(System.in);
        String inputPath;

        System.out.println("Enter Unix-style absolute paths to simplify (type 'exit' to quit):");

        while (true) {
            System.out.print("Input path: ");
            inputPath = scanner.nextLine();
            
            if (inputPath.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types 'exit'
            }
            
            String simplified = sp.simplifyPath(inputPath);
            System.out.println("Simplified Path: " + simplified);
        }

        scanner.close();
        System.out.println("Exiting the program.");
    }
}