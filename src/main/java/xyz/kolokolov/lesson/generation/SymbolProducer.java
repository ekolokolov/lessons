package xyz.kolokolov.lesson.generation;

import java.util.Random;

/**
 * Класс для создания символов
 */
public class SymbolProducer {

    /**
     * Класс Random позволяет получать случайные последовательности примитивов
     */
    private static final Random RANDOM = new Random();

    /**
     * Получить случайный символ из английского алфавита
     *
     * @return случайныую английскую букву
     */
    public static char nextRandomEnglishChar() {
        //случайным образом выбираем какой символ будет следующим - строчный или прописной
        if (RANDOM.nextBoolean()) {
            /*
            Получаем случайное число от 0 до 26 и прибавляем к этому числу позицию буквы 'A' в алфавите
             так если у 'A' позиция 65 а генератор выдал 3, то полученное число 68 будет привидено к символу 'D'
             */
            return (char) (RANDOM.nextInt(26) + 'A');
        } else {
            return (char) (RANDOM.nextInt(26) + 'a');
        }
    }

}