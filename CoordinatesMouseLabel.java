import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class CoordinatesMouseLabel extends JLabel
{
    public static String defaultContent = "(%.2f; %.2f)";

    public CoordinatesMouseLabel()
    {
        super(String.format(defaultContent, 0.0, 0.0), JLabel.CENTER);
        this.setBackground(new Color(6, 86, 214));
        this.setForeground(Color.WHITE);
        this.setOpaque(true);
        this.setFont(new Font(null, 1, 17));
        this.setVisible(true);
    }

    public void updateSize(Dimension windowSize)
    {
        this.setBounds(15, (int)(windowSize.getHeight() - 50 - 15), this.getText().length()*12, 50);
    }
}