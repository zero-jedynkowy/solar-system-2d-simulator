import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
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
    public static Dimension dimension_defaultSize;
    
    TopMenu topMenu_menuBar;
    JLayeredPane layeredPane_mainPanel;
        Canva canva_canva;
        RightMenu rightMenu_rightMenu;
        CordsLabel label_cordsLabel;
        ScaleLabel label_scaleLabel;


    public View()
    {
        super();
        View.dimension_defaultSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        View.dimension_defaultSize = new Dimension((int)(dimension_defaultSize.getWidth()/2), (int)(dimension_defaultSize.getHeight()/2));
        this.setSize(View.dimension_defaultSize);
        this.setMinimumSize(this.getSize());
        this.setTitle("Astromo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.addComponentListener(this);
            this.topMenu_menuBar = new TopMenu();
            this.layeredPane_mainPanel = new JLayeredPane();
            this.layeredPane_mainPanel.setLayout(null);
            this.layeredPane_mainPanel.setOpaque(true);
            this.layeredPane_mainPanel.setBackground(Color.RED);
            this.add(this.layeredPane_mainPanel, BorderLayout.CENTER);
            this.layeredPane_mainPanel.setVisible(true);
            this.add(this.topMenu_menuBar, BorderLayout.PAGE_START);
            this.canva_canva = new Canva();
            this.layeredPane_mainPanel.add(this.canva_canva, JLayeredPane.DEFAULT_LAYER);
            this.rightMenu_rightMenu = new RightMenu();
            this.layeredPane_mainPanel.add(this.rightMenu_rightMenu, JLayeredPane.PALETTE_LAYER);
            this.label_cordsLabel = new CordsLabel();
            this.layeredPane_mainPanel.add(this.label_cordsLabel, JLayeredPane.PALETTE_LAYER);
            this.label_scaleLabel = new ScaleLabel();
            this.layeredPane_mainPanel.add(this.label_scaleLabel, JLayeredPane.PALETTE_LAYER);
        this.repaint();
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
        try
        {
            this.canva_canva.setSize(this.layeredPane_mainPanel.getSize());
            this.rightMenu_rightMenu.updateSize(this.layeredPane_mainPanel.getSize());
            this.label_cordsLabel.updateSize(this.layeredPane_mainPanel.getSize());
            this.label_scaleLabel.updateSize(this.layeredPane_mainPanel.getSize());
        }
        catch(Exception e)
        {
            ;
        }
    }

    @Override
    public void componentShown(ComponentEvent arg0) 
    {
        ;
    }
}
