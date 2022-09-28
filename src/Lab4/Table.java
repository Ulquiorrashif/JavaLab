package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Table extends JFrame  {
    int AC=0;
    int RE=0;
    String result="Result: "+ AC +" X "+ RE;
    String scorer="Last Scorer: ";
    String winner="Winner :";
    Font font = new Font("Times new roman",Font.PLAIN,20);
     JLabel rlable = new JLabel(result, SwingConstants.CENTER);
     JLabel slable = new JLabel(scorer+"N/A",SwingConstants.CENTER);
    JLabel wlable = new JLabel(winner+"DRAW");
     JButton abutton=new JButton("AC Milan");
    JButton rbutton=new JButton("Real Madrid");
    public Table()  {
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
        abutton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AC+=1;
                rlable.setText("Result: "+ AC +" X "+ RE);
                slable.setText(scorer+ abutton.getText());
                wlable.setText(winner+win());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });




        add(rbutton);
        rbutton.setFont(font);
        rbutton.setBounds(335,0,150,300);
        rbutton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RE+=1;
                rlable.setText("Result: "+ AC +" X "+ RE);
                slable.setText(scorer+ rbutton.getText());
                wlable.setText(winner+win());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Table();
    }
    public String win(){
        if (AC>RE)
            return abutton.getText();
        else if (RE>AC)
            return rbutton.getText();
        else
            return "DRAW";
    }


}

