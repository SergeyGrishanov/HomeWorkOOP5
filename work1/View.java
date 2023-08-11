
import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    private final Scanner scanner = new Scanner(System.in);

    public void showWelcomeMessage() {
        System.out.println("Запуск калькулятора!");
    }

    public String getUserOperation() {
        System.out.println("Выбирете оператор действия (1 - '+', 2 - '-', 3 - '*', 4 - '/'):");
        return scanner.nextLine();
    }

    public double getUserNumber(String name) {
        System.out.println("Введите " + name);
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неправильное число");
            }
        }
        
    }
    public void showError(String message) {
        System.out.println("Ошибка: " + message);
    }

    public void getResult(double result) {
        System.out.println("Результат: " + result);
        System.out.println();
        System.out.println("Конец операции!");
    }

}
    