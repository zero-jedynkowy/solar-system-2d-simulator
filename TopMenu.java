import java.awt.Color;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class TopMenu extends JMenuBar
{
    public TopMenu()
    {
        super();
        this.add(new JMenu("Example"));
        this.setBackground(Color.WHITE);
    }
}
