import javax.swing.*;
import java.awt.*;

public class Ui
{
    JFrame frame;
    TopBit topPanel;
    BottomBit bottomPanel;

    public Ui()
    {
        frameInit();
    }

    public void frameInit()
    {
        this.frame = new JFrame();
        this.frame.setSize(500, 500);
        this.frame.setTitle("Java Music Player");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        this.frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        topPanel = new TopBit();
        bottomPanel = new BottomBit();
        this.frame.add(topPanel.panel);
        this.frame.add(bottomPanel.panel);
    }

    public JFrame getFrame()
    {
        return this.frame;
    }
}
