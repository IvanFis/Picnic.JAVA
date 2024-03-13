package PicnikJAVA;

import java.util.*;

public class FrequencyOfWords implements IFrequencyOfWords {
    @Override
    public HashMap<String, Integer> countFrequency(String text) {
        text = text.replaceAll("//s+", " ");
        String[] productsArray = text.split(" ");
        HashMap<String, Integer> listOfProducts = new HashMap<>();
        Set<String> uniqueProducts = new HashSet<>(List.of(productsArray));
        for (String key : uniqueProducts) {
            listOfProducts.put(key, Collections.frequency(List.of(productsArray), key));
        }

        return listOfProducts;
    }
}


