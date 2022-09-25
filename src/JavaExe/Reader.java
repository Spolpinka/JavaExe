package JavaExe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Reader extends JFrame {

    JButton b1, b2;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JToolBar tool1;
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    eHandler handler = new eHandler();

    boolean boo1;
    boolean boo2;

    public Reader(String s) {
        super(s);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        b1 = new JButton("Очистить все поля");
        b2 = new JButton("Начать процесс");
        cb3 = new JCheckBox("1. Анализ xml");
        cb4 = new JCheckBox("2. Формирование жалоб");
        cb5 = new JCheckBox("3. Поиск новых наименований постановлений");
        cb6 = new JCheckBox("4. Сохранение обновленного списка постановлений");
        cb7 = new JCheckBox("По завершении выключить комп?");
        l1 = new JLabel("Введи путь до .xml");
        tool1 = new JToolBar("Выбор нужного действия", SwingConstants.VERTICAL);
        tool1.add(cb3);
        tool1.add(cb4);
        tool1.add(cb5);
        tool1.add(cb6);
        l2 = new JLabel("нужны ли файлы?");
        cb1 = new JCheckBox("нужен ли файл для данных анализа?", false);
        cb2 = new JCheckBox("нужен ли файл для жалоб?", false);
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        t1.addActionListener(handler);
        add(tool1);
        add(l1);
        add(t1);
        //add(l2);
        add(cb1);
        add(cb2);
        add(cb7);
        //add(t2);
        add(b1);
        add(b2);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        add(l3);
        add(l4);
    }

    public class eHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b2) {
                boo1 = cb1.isSelected();
                boo2 = cb2.isSelected();
                l3.setText(String.valueOf(boo1));
                l4.setText(String.valueOf(boo2));
            }
            if (e.getSource() == b1) {
                t1.setText(null);
                t2.setText(null);
                l3.setText("");
                l4.setText("");
            }
            if (e.getSource() == t1) {
                l3.setText("сработало поле");
            }

        }
    }
}
