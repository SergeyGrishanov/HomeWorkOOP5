package work2;

import java.util.Scanner;

public class UserView {
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public static void userIteraction() {
        User user = User.loadFromFile("users.txt");
        UserView view = new UserView();
        UserPresent presenter = new UserPresent(user, view);

        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Зарегистрироваться");
            System.out.println("2. Войти");
            System.out.println("3. Изменить пароль");
            System.out.println("4. Выйти");
            choice = Integer.parseInt(view.getInput("Введите дейсвие"));
            System.out.println();

            switch (choice) {
                case 1:
                    presenter.registerUser();
                    break;
                case 2:
                    presenter.loginUser();
                    break;
                case 3:
                    presenter.changePassword();
                    break;
                case 4:
                    System.out.println("Возвращайтесь снова!");
                    System.out.println();
                    break;
                default:
                    view.showMessage("Такого результата выбота не существует");
                    break;

            }
        }
    }
}
