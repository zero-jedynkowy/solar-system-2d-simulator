import java.awt.Dimension;

import javax.swing.JLabel;

public class ScaleLabel extends CoordinatesMouseLabel
{
    public static String defaultContent = "Scale: %.1f";

    
    public ScaleLabel()
    {
        super();
        this.setText(String.format(defaultContent, 0.0));
    }

    @Override
    public void updateSize(Dimension windowSize)
    {
        this.setBounds(15, 15, this.getText().length()*12, 50);
    }
}