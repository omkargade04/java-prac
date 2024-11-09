import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class applet extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame("Experiment 11");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new applet());
        f.setSize(400, 400);
        f.setLocation(400, 400);
        f.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(200, 300, 200, 100);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        g2.drawRect(150, 250, 100, 50);

        Graphics2D g3 = (Graphics2D) g;
        g3.setColor(Color.BLUE);
        g3.drawOval(100, 20, 200, 100);
    }
}
