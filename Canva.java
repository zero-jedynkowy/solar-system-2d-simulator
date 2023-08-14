import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Canva extends JPanel
{
    public Canva()
    {
        super();
        this.setBackground(Color.BLACK);
        this.setOpaque(true);
        this.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        this.drawAxis(g);
    }

    public void drawAxis(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
        g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
    }
}