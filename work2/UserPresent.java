package work2;

public class UserPresent {
    private User user;
    private UserView view;

    public UserPresent(User user, UserView view) {
        this.user = user;
        this.view = view;
    }

    public void registerUser() {
        String name = view.getInput("Введите ваше имя");
        String login = view.getInput("Введите ваш логин");
        String password = view.getInput("Введите пароль");

        user = new User(name, login, password);
        user.setName(name);
        user.setLogin(login);
        user.setPassword(password);
        user.saveToFile("users.txt");

        view.showMessage("Вы успешно зарегистрировались");
        System.out.println();
    }

    public void loginUser() {
        String login = view.getInput("Введите логин");
        String password = view.getInput("Введите пароль");
        System.out.println();

        if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
            view.showMessage("Вы успешно вошли");
            System.out.println();
        } else {
            view.showMessage("Неправельно введён пароль или логин");
            System.out.println();
        }
    }

    public void changePassword() {
        String oldPassword = view.getInput("Введите старый пароль: ");
        String newPassword = view.getInput("Введите новый пароль: ");
        System.out.println();

        if (oldPassword.equals(user.getPassword())) {
            user.setPassword(newPassword);
            user.saveToFile("users.txt");
            view.showMessage("Пароль изменён успешно");
            System.out.println();
        } else {
            view.showMessage("Неправильно введён пароль");
            System.out.println();
        }
    }
}
