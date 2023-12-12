import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TopBit
{
    JPanel panel;
    ArrayList<Song> list;

    public TopBit()
    {
        panelInit();
    }

    public void panelInit()
    {
        panel = new JPanel();
        this.panel.setSize(500, 350);
        this.panel.setBackground(Color.WHITE);
    }

    public void setSize(int size)
    {
        list = new ArrayList<Song>(size);
    }
}