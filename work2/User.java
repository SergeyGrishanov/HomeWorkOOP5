package work2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Модель (Model): Создайте класс User для представления учетной записи пользователя. 
// Этот класс будет содержать поля для имени, логина и пароля пользователя, а также методы доступа к этим полям. 
// Модель также может содержать методы для сохранения и загрузки данных пользователя.

public class User {
    private String name;
    private String login;
    private String password;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(name + "\n"  +  login + "\n" + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static User loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String name = reader.readLine();
            String login = reader.readLine();
            String password = reader.readLine();
            User user = new User(name, login, password);
            user.setName(name);
            user.setLogin(login);
            user.setPassword(password);
            return user;
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        return null;
    }

}
