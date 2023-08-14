package solar_system;
import java.awt.Dimension;

public class ScaleLabel extends DefaultLabel
{
    @Override
    public void updateSize(Dimension windowSize)
    {
        this.updateText();
        this.setBounds(15, 15, this.getText().length()*12, 50);
    }

    @Override
    public void updateText() 
    {
        this.setText(String.format("Scale: %.1fx", 1.0));
    }
}