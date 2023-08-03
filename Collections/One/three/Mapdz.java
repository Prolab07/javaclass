package Collections.One.three;

import java.util.HashMap;
import java.util.Map;

// задача про створення мапи со слов на 4 языках

public class Mapdz {
    public static void main(String[] args) {

        Map<Integer, Word> words = new HashMap<>();

        Word yabluko = new Word("яблуко", "apple", "apfer", "mela");
        Word kit = new Word("кіт", "cat", "der kater", "gatto");
        Word sobaka = new Word("собака", "dog", "hung", "cane");
        Word luduna = new Word("людина", "human", "mensch", "umano");
        Word zhinka = new Word("жінка", "woman", "frau", "donna");
        Word cholovik = new Word("чоловік", "man", "mann", "uomo");
        Word dutuna = new Word("дитина", "child", "kind", "bambino");
        Word mama = new Word("мати", "mather", "muter", "mama");
        Word papa = new Word("батько", "father", "vater", "padre");
        Word banan = new Word("банан", "banana", "banane", "banana");

        words.put(1, yabluko);
        words.put(2, kit);
        words.put(3, sobaka);
        words.put(4, luduna);
        words.put(5, zhinka);
        words.put(6, cholovik);
        words.put(7, dutuna);
        words.put(8, mama);
        words.put(9, papa);
        words.put(10, banan);

        words.get(1);
        words.get(2);
        words.get(3);
        words.get(4);
        words.get(5);
        words.get(6);
        words.get(7);
        words.get(8);
        words.get(9);
        words.get(10);

        System.out.println(words);

        System.out.println("____________________________");
        System.out.println(yabluko);
        System.out.println(kit);
        System.out.println(sobaka);
        System.out.println(luduna);
        System.out.println(zhinka);
        System.out.println(cholovik);
        System.out.println(dutuna);
        System.out.println(mama);
        System.out.println(papa);
        System.out.println(banan);
    }
}
