package xyz.kolokolov.lesson.generation;

import static xyz.kolokolov.lesson.generation.LoginGenerator.getNexDefaultLogin;
import static xyz.kolokolov.lesson.generation.PasswordGenerator.getPassword;

public class Generation {

    public static void main(String[] args) {
        String login = getNexDefaultLogin();
        String password = getPassword();

        System.out.println(login);
        System.out.println(password);
    }
}
