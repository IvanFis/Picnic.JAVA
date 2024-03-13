package PicnikJAVA;

public class MaxLongWord implements IMaxLongWord {
    @Override
    public void foundMaxLongWord(String text) {
        int result= 0;
        int max = 0;
        text = text.replaceAll("//s+", " ");
        String[] array = text.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                result = i;
            }
        }
        System.out.println("Самое длинное слово в списке для пикника - " + array[result] + ", длина слова составляет " + max + " букв.");
    }
}
