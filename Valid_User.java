import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Valid_User implements ActionListener {
    JFrame f;
    JLabel l;
    JButton b;
    Container c;

    Valid_User() {
        f = new JFrame("VALID User  ");
        c = f.getContentPane();
        f.setLayout(null);
        l = new JLabel(" VALID USER ");
        l.setBounds(710, 350, 180, 80);
        b = new JButton(" Continue ");
        b.setBounds(700, 450, 120, 40);
        c.add(l);
        c.add(b);
        b.addActionListener(this);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(700, 700);
    }

    public void actionPerformed(ActionEvent e) {

        new Shopping_Invoice();
        f.dispose();
    }

}
