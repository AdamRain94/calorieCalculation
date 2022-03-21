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
//        Scanner sexIn = new Scanner(System.in);
//        Scanner weightIn = new Scanner(System.in);
//        Scanner heightIn = new Scanner(System.in);
//        Scanner ageIn = new Scanner(System.in);
//        Scanner activityLevelIn = new Scanner(System.in);
//        while (true){
//            System.out.print("Введите ваш пол (М/Ж): ");
//            sex = sexIn.nextLine();
//            System.out.print("Введите ваш вес в килограммах (Например - 60,5): ");
//            weight = weightIn.nextDouble();
//            System.out.print("Введите ваш рост в см (Например - 180): ");
//            height = heightIn.nextInt();
//            System.out.print("Введите ваш возраст (Например - 23): ");
//            age = ageIn.nextInt();
//            System.out.print("=== Выберите ваш уровень активности ===" + System.lineSeparator() +
//                            "\t- Если у вас нет физических нагрузок и сидячая работа, введите - 1" + System.lineSeparator() +
//                            "\t- Если вы совершаете небольшие пробежки или делаете легкую гимнастику 1–3 раза в неделю, введите - 2" + System.lineSeparator() +
//                            "\t- Если вы занимаетесь спортом со средними нагрузками 3–5 раз в неделю, введите - 3" + System.lineSeparator() +
//                            "\t- Если вы полноценно тренируетесь 6–7 раз в неделю, введите - 4" + System.lineSeparator() +
//                            "\t- Если ваша работа связана с физическим трудом, вы тренируетесь 2 раза в день и включаете в программу тренировок силовые упражнения, введите - 5" + System.lineSeparator() +
//                            "(Например - 1): ");
//            activityLevel = activityLevelIn.nextInt();
//            System.out.println();
//            Calculation calculation = new Calculation(sex, weight, height, age, activityLevel);
//            result = calculation.getCountCalories();
//        }
    }
    public void  start(){
        System.out.println(result);
    }
}
