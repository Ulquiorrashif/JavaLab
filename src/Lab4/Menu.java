package Lab4;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    JButton pop =new JButton();
    public Menu()  {
        setLayout(new FlowLayout());

        setSize(400,300);
        setVisible(true);

        add(pop);
        pop.setSize(10,10);


    }

    public static void main(String[] args) {
        new Menu();
    }
}
