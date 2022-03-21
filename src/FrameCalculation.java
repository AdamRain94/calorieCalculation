import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.VetoableChangeListener;

public class FrameCalculation {
    private JPanel panel;
    private JComboBox comboBox1;
    private JTextArea weight;
    private JTextArea height;
    private JTextArea age;
    private JComboBox comboBox2;
    private JTextPane Result;
    private JButton START;
    private JScrollPane scrol;
    main main = new main();

    public JPanel getPanel() {
        return panel;
    }

    public FrameCalculation() {

        START.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(main.weight);
                System.out.println(main.height);
                System.out.println(main.age);
                System.out.println(main.sex);
                System.out.println(main.activityLevel);
                String age = main.age;
                String sex = main.sex;
                String weight = main.weight;
                String height = main.height;
                String activityLevel = main.activityLevel;
                try {
                    if (Integer.parseInt(age) <= 0 || Double.parseDouble(weight) <= 0 || Integer.parseInt(height) <= 0){
                        Result.setText("\t!!! НЕКОРРЕКТНО ВВЕДЕННЫЕ ДАННЫЕ !!!");
                    } else {
                    Calculation calculation = new Calculation(sex, weight, height, age, activityLevel);
                    main.result = calculation.getCountCalories();
                    Result.setText(main.result);}
                } catch (Exception exception) {
                    Result.setText("\t!!! НЕКОРРЕКТНО ВВЕДЕННЫЕ ДАННЫЕ !!!");
                }
                Result.setForeground(Color.BLACK);
                main.start();
            }
        });

        weight.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.weight = "";
            }

            @Override
            public void mousePressed(MouseEvent e) {
                main.weight = "";
                weight.setText("");
            }
        });

        height.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.height = "";
            }

            @Override
            public void mousePressed(MouseEvent e) {
                main.height = "";
                height.setText("");
            }
        });

        age.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                main.age = "";
            }

            @Override
            public void mousePressed(MouseEvent e) {
                main.age = "";
                age.setText("");
            }
        });


        weight.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char symbol = e.getKeyChar();
                main.weight += symbol;
                weight.setForeground(Color.BLACK);
            }
        });

        height.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char symbol = e.getKeyChar();
                main.height += symbol;
                height.setForeground(Color.BLACK);
            }
        });

        age.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char symbol = e.getKeyChar();
                main.age += symbol;
                age.setForeground(Color.BLACK);
            }
        });

        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                main.sex = String.valueOf(e.getItem());
                comboBox1.setForeground(Color.BLACK);
            }

        });

        comboBox1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                comboBox1.removeItem("Выбрать...");
            }
        });

        comboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                main.activityLevel = String.valueOf(e.getItem());
                comboBox2.setForeground(Color.BLACK);

            }
        });

        comboBox2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                comboBox2.removeItem("Выбрать...");
            }
        });
    }
}
