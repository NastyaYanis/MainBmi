public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        // Пример 1: рост 1.87 м, вес 98 кг
        double height = 1.87; // рост в метрах
        int weight = 98; // вес в килограммах
        int bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела (BMI): " + bmi); // Ожидаемый результат: 28

        // Пример 2: рост 1.75 м, вес 70 кг
        height = 1.75;
        weight = 70;
        bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела (BMI): " + bmi); // Ожидаемый результат: 22
    }
}