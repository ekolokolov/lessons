package xyz.kolokolov.lesson.generation;

/**
 * Класс генерации логинов
 */
public class LoginGenerator {

    private static final String POSTFIX = "@mail.ru";
    private static final String PREFIX = "test";
    //Колличество сгенерированных логинов
    static int count = 0;

    /**
     * Генерация логина вида PREFIX${n}POSTFIX
     *
     * @return при каждом вызове возвращает новый, не повторяющийся логин
     */
    static String getNexDefaultLogin() {
        String prefix = PREFIX + count++;
        return prefix + POSTFIX;
    }

}
