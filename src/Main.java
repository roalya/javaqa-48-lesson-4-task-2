public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 70;
        double height = 1.64;

        double bmi = service.calculate(weight, height);

        System.out.println("Вес: " + weight + " кг, рост: " + height + " м, ИМТ: " + bmi + ".");
    }
}
