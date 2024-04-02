package ContactForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    JTextField name_field, surname_field;
    JRadioButton male;
    JCheckBox check;
    public ContactForm (){
        super("контактная форма");
        super.setBounds(100,100,300,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5,2,2,2));

        JLabel name = new JLabel("Введите имя");
        name_field = new JTextField("",1);
        JLabel surname = new JLabel("Введите фамилию:");
        surname_field = new JTextField("",1);

        container.add(name);
        container.add(name_field);
        container.add(surname);
        container.add(surname_field);

        male = new JRadioButton("мужской");
        JRadioButton female = new JRadioButton("женский");
        check = new JCheckBox("согласен", false);
        JButton send_button = new JButton("Отправить");

        male.setSelected(true);

        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(send_button);

        send_button.addActionListener(new ButtonEventManager ());


    }

    class ButtonEventManager implements ActionListener {

        @Override 
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String surname = surname_field.getText();

            String isMale = "Мужской";
            if (!male.isSelected())
                isMale = "Женский";

            boolean checkbox = check.isSelected();

            JOptionPane.showMessageDialog(null,"LABA DENA!!! " + name
            + "\nВаша фамилия: " + surname
            + "\nВаш пол: " + isMale + "\nСогласие: " + checkbox);
        }
    }


}
