import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public abstract class DefaultLabel extends JLabel
{
    public DefaultLabel()
    {
        super("", JLabel.CENTER);
        this.setBackground(new Color(6, 86, 214));
        this.setForeground(Color.WHITE);
        this.setOpaque(true);
        this.setFont(new Font(null, 1, 17));
        this.setVisible(true);
    }

    public abstract void updateSize(Dimension windowSize);
    public abstract void updateText();
}