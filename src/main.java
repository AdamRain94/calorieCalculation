import com.sun.tools.javac.Main;

import javax.swing.*;

public class main {
    public static String result = "";
    public static String sex = "";
    public static String weight = "";
    public static String height = "";
    public static String age = "";
    public static String activityLevel = "";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор калорий beta version 1.0");
        FrameCalculation frameCalculation = new FrameCalculation();
        frame.add(frameCalculation.getPanel());
        frame.setResizable(false);
        frame.setSize(500, 580);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void  start(){
        System.out.println(result);
    }
}
