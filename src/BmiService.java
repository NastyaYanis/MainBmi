public class BmiService {
    public int calculate(double heightInMeters, int weightInKilograms) {
        // Рассчитываем BMI по формуле
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        // Приводим результат к целому числу
        return (int) bmi;
    }
}