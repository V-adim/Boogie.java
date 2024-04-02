package Calculator;

import ContactForm.ContactForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    JTextField windowIn;
    String displey = "0";
    public Calculator() {
        super("КАЛЬКУЛЯТОР");
        super.setBounds(100, 100, 300, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 4, 1, 1));
        windowIn = new JTextField(displey, 1);
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");

        container.add(windowIn);
        container.add(one);container.add(two);
        container.add(three);
        container.add(four);
        container.add(five);
        container.add(six);
        container.add(seven);
        container.add(eight);
        container.add(nine);
        container.add(zero);

        one.addActionListener(new ButtonEventManager ());


    }

    class ButtonEventManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String displey = "1";
//            String displey = windowIn.getText();
        }
    }
}