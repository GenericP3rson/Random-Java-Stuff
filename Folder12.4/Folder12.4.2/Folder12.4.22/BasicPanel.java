import java.awt.*;
import javax.swing.*;

public class BasicPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color c[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK};
        // g.setColor(c[(int)(Math.random()*c.length)]);
        g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
        g.drawLine(10, 10, 100, 50);
        g.drawLine(10, 50, 100, 10);
        // g.setColor(c[(int) (Math.random() * c.length)]);
        g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        g.drawRect(150, 10, 100, 50);
        // g.setColor(Color.BLUE);
        // g.setColor(c[(int) (Math.random() * c.length)]);
        g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        g.drawRoundRect(300, 10, 100, 50, 10, 10);
        // g.setColor(c[(int) (Math.random() * c.length)]);
        g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        g.drawOval(10, 100, 120, 40);
        // g.setColor(c[(int) (Math.random() * c.length)]);
        g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        g.fillRect(150, 100, 100, 50);
        // g.setColor(c[(int) (Math.random() * c.length)]);
        g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
        g.fillRoundRect(300, 100, 100, 50, 10, 10);

    }
    public static void main(String args[]) {
        // paintComponent();
        JFrame j = new JFrame("Test Figure Panel");
        j.add(new BasicPanel());
        j.setSize(450, 200);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}