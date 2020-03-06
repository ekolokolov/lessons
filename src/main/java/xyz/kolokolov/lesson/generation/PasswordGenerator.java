package xyz.kolokolov.lesson.generation;

/**
 * Класс генерации паролей
 */
public class PasswordGenerator {

    //стандартная длинна пароля
    private static final int DEFAULT_PASSWORD_LENGTH = 8;

    /**
     * Сгенерировать новый стандартный пароль
     *
     * @return стандартный пароль
     */
    static String getPassword() {
        return getPassword(DEFAULT_PASSWORD_LENGTH);
    }

    /**
     * Сгенерировать новый пароль заданной длинны
     *
     * @param length колличество символов в пароле
     * @return пароль из случайных символов заданной длинны
     */
    static String getPassword(int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append(SymbolProducer.nextRandomEnglishChar());
        }
        return result.toString();
    }
}
