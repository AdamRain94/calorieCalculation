public class Calculation {

    private String sex;
    private double weight;
    private int height;
    private int age;
    private double activityLevel;
    private double countCalories;
    private double proteins;
    private double fats;
    private double carbohydrates;

    public Calculation(String sex, String weight, String height, String age, String activityLevel) {
        this.sex = sex;
        this.weight = Double.parseDouble(weight);
        this.height = Integer.parseInt(height);
        this.age = Integer.parseInt(age);
        if (Double.parseDouble(activityLevel) == 1) {
            this.activityLevel = 1.2;
        }
        if (Double.parseDouble(activityLevel) == 2) {
            this.activityLevel = 1.375;
        }
        if (Double.parseDouble(activityLevel) == 3) {
            this.activityLevel = 1.55;
        }
        if (Double.parseDouble(activityLevel) == 4) {
            this.activityLevel = 1.725;
        }
        if (Double.parseDouble(activityLevel) == 5) {
            this.activityLevel = 1.9;
        }
        CalculationCountCalories();
        CalculationBZHU();
        System.out.println(countCalories);
    }

    public String getCountCalories() {
        String result = String.format("%.2f",countCalories);
        return "Норма количества калорий: " + result + System.lineSeparator() +
        "Примерная норма БЖУ:" + System.lineSeparator() +
        "  - Белки - " + (int) proteins + " г." + System.lineSeparator() +
        "  - Жиры - " + (int) fats + " г." + System.lineSeparator() +
        "  - Углеводы - " + (int) carbohydrates + " г.";
    }

    private void CalculationBZHU() {
        proteins = (countCalories * 0.2) / 4.1;
        fats = (countCalories * 0.3) / 9.29;
        carbohydrates = (countCalories * 0.5) / 4.1;
    }

    private void CalculationCountCalories() {
        if (sex.equals("Мужской")) {
            countCalories = ((10 * weight) + (6.25 * height) - (5 * age) + 5) * activityLevel;
        }
        if (sex.equals("Женский")) {
            countCalories = ((10 * weight) + (6.25 * height) - (5 * age) - 161) * activityLevel;
        }
    }
}
