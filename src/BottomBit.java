import javax.swing.*;
import java.awt.*;

public class BottomBit
{
    JPanel panel;

    public BottomBit()
    {
        panelInit();
    }

    public void panelInit()
    {
        panel = new JPanel();
        this.panel.setSize(500, 150);
        this.panel.setBackground(Color.black);
    }
}
