package correction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    public static void main(String[] args) {
        OneWindow window1 = new OneWindow();
        window1.setVisible(true);

    }
}


class  OneWindow extends JFrame {

    JButton opentwo = new JButton("Открыть второе окно");
    JLabel label = new JLabel("Здесь должна появиться надпись из второго окна");

    public OneWindow(){
        setTitle("Главное окно");
        setBounds(800, 300, 400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(opentwo, BorderLayout.SOUTH);
        add(label, BorderLayout.NORTH);

        TwoWindow win2 = new TwoWindow(this);
        win2.setVisible(false);

        opentwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               win2.setVisible(true);
            }
        });
    }


        }

class  TwoWindow extends JFrame{

    OneWindow widowone;
    JTextField text = new JTextField();
    JButton pushbut = new JButton("Отправить на первое окно");

    public TwoWindow(OneWindow windowone){
        this.widowone=windowone;
        setTitle("Главное окно");
        setBounds(900, 400, 400, 400);
        add(text,BorderLayout.NORTH);
        add(pushbut,BorderLayout.SOUTH);

        pushbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                windowone.label.setText(text.getText());
                setVisible(false);
            }
        });




    }
}