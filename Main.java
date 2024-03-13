package PicnikJAVA;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            FileOutputStream fis = new FileOutputStream(file);
            String products ="Яблоко Шашлык Макароны Апельсин Хлеб Колбаса Шашлык Колбаса Кетчуп Огурцы Горчица Колбаса Шашлык Ликер Сок Хлеб Колбаса ";
            fis.write(products.getBytes());
            fis.close();
            String text = new String(products.getBytes());
            System.out.println("Содержание: " + text);

            CountQuantity countQuantity = new CountQuantity();
            countQuantity.countWords(text);

            MaxLongWord maxLongWord = new MaxLongWord();
            maxLongWord.foundMaxLongWord(text);

            FrequencyOfWords frequencyOfWords = new FrequencyOfWords();
            System.out.println(frequencyOfWords.countFrequency(text));




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

