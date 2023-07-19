import ru.netology.services.VacaitionMounthsCalculation;

public class Main {
    public static void main(String[] args) {
        VacaitionMounthsCalculation calc = new VacaitionMounthsCalculation();
        int balanceTaskOne = calc.calculate(10_000, 3_000, 20_000);
        int countOne = balanceTaskOne; // количество месяцев отдыха
        System.out.println("Количество месяцев отдыха в году - " + countOne); // вывод количества месяцев отдыха пользователя


    }
}

