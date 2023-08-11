import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class RightMenu extends JPanel
{
    public boolean isHide;
    
    public RightMenu()
    {
        super();
        this.setBackground(Color.WHITE);
        this.isHide = false;
        this.setOpaque(true);
    }

    public void updateSize(Dimension windowSize)
    {
        if(this.isHide)
        {
            double temp = windowSize.getWidth() * 0.2;
            this.setLocation((int)(windowSize.getWidth() - temp), 0);
            this.setSize((int)temp, (int)(windowSize.getHeight()));
        }
        else
        {
            this.setLocation((int)(windowSize.getWidth() - 25), 0);
            this.setSize(25, (int)(windowSize.getHeight()));
        }
    }
}