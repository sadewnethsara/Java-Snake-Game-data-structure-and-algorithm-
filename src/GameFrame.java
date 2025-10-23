import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameFrame() {
        // Create an instance of the panel that contains our game logic
        GamePanel gamePanel = new GamePanel();

        // Add the panel to the game frame (the window)
        this.add(gamePanel);

        this.setTitle("Snake"); // Set the title for the window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed
        this.setResizable(false); // Make the window not resizable
        this.pack(); // Sizes the frame so that all its contents are at or above their preferred sizes
        this.setVisible(true); // Make the window visible
        this.setLocationRelativeTo(null); // Center the window on the screen
    }
}