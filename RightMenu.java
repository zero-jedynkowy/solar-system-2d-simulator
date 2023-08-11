import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RightMenu extends JPanel
{
    private boolean boolean_isHide;

    private JButton button_showHide;
    
    public RightMenu()
    {
        super();
        this.setBackground(Color.WHITE);
        this.boolean_isHide = false;
        this.setOpaque(true);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.setElements();
        this.addElements();
        this.addActionsElements();
    }

    private void setElements()
    {
        this.button_showHide = new JButton();
        this.button_showHide.setBackground(new Color(6, 86, 214));
        this.button_showHide.setBorderPainted(false);
        this.button_showHide.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void addElements()
    {
        this.add(this.button_showHide);
    }

    private void addActionsElements()
    {
        this.button_showHide.addActionListener(e -> {
            this.boolean_isHide = !this.boolean_isHide;
            this.updateSize(this.getParent().getSize());


        });
    }

    public void updateSize(Dimension windowSize)
    {
        if(this.boolean_isHide)
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
        this.button_showHide.setSize(new Dimension(25, (int)windowSize.getHeight()));
    }
}