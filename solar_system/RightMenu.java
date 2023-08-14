package solar_system;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RightMenu extends JPanel
{
    private boolean boolean_isHide;

    private JButton button_showHide;
    private JPanel panel_mainPanel;
    private JLabel label_title;
    
    public RightMenu()
    {
        super();
        this.setBackground(Color.WHITE);
        this.boolean_isHide = true;
        this.setOpaque(true);
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        this.setElements();
        this.addElements();
        this.addActionsElements();
    }

    private void setElements()
    {
        this.button_showHide = new JButton();
        this.button_showHide.setBackground(new Color(6, 86, 214));
        this.button_showHide.setBorderPainted(false);
        this.button_showHide.setBorder(null);
        this.button_showHide.setCursor(new Cursor(Cursor.HAND_CURSOR));

        this.panel_mainPanel = new JPanel();
        this.panel_mainPanel.setOpaque(true);
        this.panel_mainPanel.setBackground(Color.WHITE);
        this.panel_mainPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.panel_mainPanel.setLayout(new BoxLayout(this.panel_mainPanel, BoxLayout.Y_AXIS));
        this.panel_mainPanel.setAlignmentY(CENTER_ALIGNMENT);

        this.label_title = new JLabel("Astromo", JLabel.CENTER);
        this.label_title.setAlignmentX(CENTER_ALIGNMENT);
        this.label_title.setHorizontalAlignment(SwingConstants.CENTER);
        this.label_title.setForeground(new Color(6, 86, 214));
        this.label_title.setFont(new Font(null, 1, 20));
    }

    private void addElements()
    {
        this.add(this.button_showHide);
        this.add(this.panel_mainPanel);
           this.panel_mainPanel.add(this.label_title);
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
            this.setLocation((int)(windowSize.getWidth() - 25), 0);
            this.setSize(25, (int)(windowSize.getHeight()));
            this.setMaximumSize(this.getSize());
            this.panel_mainPanel.setVisible(false);
        }
        else
        {
            double temp = windowSize.getWidth() * 0.2;
            this.setLocation((int)(windowSize.getWidth() - temp), 0);
            this.setSize((int)temp, (int)(windowSize.getHeight()));
            this.setMaximumSize(this.getSize());
            this.panel_mainPanel.setVisible(true);
        }
        
        this.panel_mainPanel.setMaximumSize(new Dimension(this.getWidth() - 25, this.getHeight()));
        this.panel_mainPanel.setSize(new Dimension(this.getWidth() - 25, this.getHeight()));
        this.button_showHide.setMaximumSize(new Dimension(25, (int)this.getHeight()));
        this.button_showHide.setSize(new Dimension(25, (int)this.getHeight()));
        this.button_showHide.setMinimumSize(new Dimension(25, (int)this.getHeight()));
        this.label_title.setMaximumSize(new Dimension(this.panel_mainPanel.getWidth(), 50));
        this.label_title.setSize(this.panel_mainPanel.getWidth(), 50);
    }
}