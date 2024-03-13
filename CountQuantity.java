package PicnikJAVA;


public class CountQuantity implements ICountQuantity {
    @Override
    public void countWords(String text) {
        String[] words = text.split(" ");
        System.out.println("Количество продуктов: " + words.length);
    }
}
