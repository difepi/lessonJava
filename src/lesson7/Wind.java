package lesson7;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Wind {
    public static void main(String[] args) {
        MyWindow win1 = new MyWindow("Фамилия Имя Отчество");

    }

}


class MyWindow extends JFrame {
    public MyWindow(String text) {


       setTitle("Окно № 1");
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setBounds(300, 300, 400, 400);
       setLayout(new BorderLayout());
       JButton but = new JButton("Поехали");
       add(but,BorderLayout.SOUTH);
       JLabel lab = new JLabel(text);
       add(lab,BorderLayout.CENTER);
       OpenWin2();

        setVisible(true );
   }

   public void  OpenWin2 (){
       JButton but = new JButton("Поехали");
               add(but,BorderLayout.SOUTH);
               but.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       WindowTwo win2 = new WindowTwo();
                       setVisible(false);

                   }
               });

   }

}

  class WindowTwo extends JFrame {
      public static String text = "    ";


      public WindowTwo() {

          setTitle("Окно № 2");
          setBounds(500, 500, 400, 400);
          JTextField insertText = new JTextField(20);
          JTextField insertText1 = new JTextField(20);
          JTextField insertText2 = new JTextField(20);

          JButton buttonOk = new JButton("Отправить");
          setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

          add(insertText);
          add(insertText1);
          //insertText.getText();
          add(insertText2);
          add(buttonOk);
          setVisible(true);
          buttonOk.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  text = insertText.getText()+" "+ insertText1.getText()+" "+insertText2.getText();
                  MyWindow OutWin = new MyWindow(text);
                  setVisible(false);

              }
          });

      }
  }






