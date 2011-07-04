import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Draw {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Paint");
        frame.setSize(new Dimension(640, 480));
        DrawPanel panel = new DrawPanel();
        MyListener listener = new MyListener();
        listener.setPanel(panel);
        panel.addMouseMotionListener(listener);
        frame.add(panel);
        frame.setVisible(true);
    }
}

class DrawPanel extends JPanel {
    private int x = 0;
    private int y = 0;
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}  
    public void paintComponent(Graphics graphics) {
        graphics.drawOval(x, y, 10, 10);
    }
}

class MyListener implements MouseMotionListener {
    DrawPanel panel;
    public void setPanel(DrawPanel panel) {this.panel = panel;}
    public void mouseDragged(MouseEvent event) {
        panel.setX(event.getX());
        panel.setY(event.getY());
        panel.repaint();
    }
    public void mouseMoved(MouseEvent event) {}
}
