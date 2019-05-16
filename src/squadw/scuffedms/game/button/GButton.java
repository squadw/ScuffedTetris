package squadw.scuffedms.game.button;

import javax.swing.*;
import java.awt.*;

public class GButton extends JButton {

    GridBagConstraints c = new GridBagConstraints();

    public GButton() {
        super();
        setCons();
    }

    private void setCons() {
        c.ipadx = 10;
        c.ipady = 30;
    }

    public void addButtonToFrame(JFrame frame) {
        frame.add(this, c);
    }
}
