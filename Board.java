import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

public class Board extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawDonut(g);
    }

    private void drawDonut(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh
                = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        Dimension size = getSize();
        double w = size.getWidth();
        double h = size.getHeight();

        int init_x = 50;
        int init_y = 50;
        int diam = 40;
        int space = 5;

        Ellipse2D e1 = new Ellipse2D.Double(init_x, init_y, diam, diam);
        Ellipse2D e2 = new Ellipse2D.Double(init_x+(diam+space), init_y, diam, diam);
        Ellipse2D e3 = new Ellipse2D.Double(init_x+(diam+space)*2, init_y, diam, diam);
        Ellipse2D e4 = new Ellipse2D.Double(init_x+(diam+space)*3, init_y, diam, diam);
        Ellipse2D e5 = new Ellipse2D.Double(init_x+(diam+space)*4, init_y, diam, diam);

        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.gray);

        g2d.draw(e1);
        g2d.draw(e2);
        g2d.draw(e3);
        g2d.draw(e4);
        g2d.draw(e5);

    }
  }
