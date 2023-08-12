import java.awt.Dimension;

public class CordsLabel extends DefaultLabel
{
    @Override
    public void updateSize(Dimension windowSize) 
    {
        this.updateText();
        this.setBounds(15, (int)(windowSize.getHeight() - 50 - 15), this.getText().length()*12, 50);
    }

    @Override
    public void updateText() 
    {
        this.setText(String.format("(%.2f; %.2f)", Model.getRelativeMouseX(), Model.getRelativeMouseY()));
    }
}
