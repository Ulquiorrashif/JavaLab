package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Table extends JFrame  {
    int AC;
    int RE;
    String result="Result: "+ AC +" X "+ RE;
    String scorer="Last Scorer: ";
    String winner="Winner :";
    Font font = new Font("Times new roman",Font.PLAIN,20);
     JLabel rlable = new JLabel(result, SwingConstants.CENTER);
     JLabel slable = new JLabel(scorer+"N/A",SwingConstants.CENTER);
    JLabel wlable = new JLabel(winner+"DRAW",SwingConstants.CENTER);
     JButton abutton=new JButton("AC Milan");
    JButton rbutton=new JButton("Real Madrid");
    public Table() throws HeadlessException {
        setLayout(null);
        setSize(500,339);



        add(rlable);
        rlable.setSize(500,50);
        rlable.setBounds(135,0,200,30);
        rlable.setOpaque(true);
        rlable.setBackground(Color.green);
        rlable.setForeground(Color.BLUE);
        rlable.setFont(font);

        add(slable);
        slable.setBounds(135,137,200,30);
        slable.setOpaque(true);
        slable.setBackground(Color.green);
        slable.setForeground(Color.BLUE);
        slable.setFont(font);

        add(wlable);
        wlable.setBounds(135,270,200,30);
        wlable.setOpaque(true);
        wlable.setBackground(Color.green);
        wlable.setForeground(Color.BLUE);
        wlable.setFont(font);


        add(abutton);
        abutton.setFont(font);
        abutton.setBounds(0,0,135,300);




        add(rbutton);
        rbutton.setFont(font);
        rbutton.setBounds(335,0,150,300);










        setVisible(true);
    }

    public static void main(String[] args) {
        new Table();
    }


}
class MyMouse extends JFrame
{
    JLabel lbl = new JLabel("");
    public MyMouse()
    {
        super("Dude! Where's my mouse ?");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(
                new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {lbl.setText("X="+a.getX()+" Y="+a.getY());}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new MyMouse().setVisible(true);
    }
}
