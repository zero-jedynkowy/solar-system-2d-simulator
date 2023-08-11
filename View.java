import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class View extends JFrame implements ComponentListener
{
    Dimension dimension_size;
    
    public View()
    {
        super();
        this.dimension_size = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.dimension_size = new Dimension((int)(dimension_size.getWidth()/2), (int)(dimension_size.getHeight()/2));
        this.setSize(this.dimension_size);
        this.setMinimumSize(this.getSize());
        this.setTitle("Astromo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.repaint();
        this.addComponentListener(this);
        this.setVisible(true);
    }

    @Override
    public void componentHidden(ComponentEvent arg0) 
    {
        ;
    }

    @Override
    public void componentMoved(ComponentEvent arg0) 
    {
        ;
    }

    @Override
    public void componentResized(ComponentEvent arg0) 
    {
        System.out.println("ss");
    }

    @Override
    public void componentShown(ComponentEvent arg0) 
    {
        ;
    }
}
