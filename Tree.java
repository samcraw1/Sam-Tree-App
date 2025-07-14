import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class TreeApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        frame.add(new TreePanel());
        frame.setVisible(true);
    }
}

class TreePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw text
        g.setColor(Color.BLACK);
        g.drawString("Hey I'm Sam", 90, 30);
        g.drawString("Let's plant a tree:", 80, 50);

        // Draw tree (simple ASCII style)
        g.setColor(new Color(34, 139, 34)); // green
        g.fillOval(110, 80, 80, 40); // top leaves
        g.fillOval(100, 110, 100, 40); // middle leaves
        g.fillOval(110, 140, 80, 40); // bottom leaves

        g.setColor(new Color(139, 69, 19)); // brown
        g.fillRect(145, 180, 20, 60); // trunk
    }
} 