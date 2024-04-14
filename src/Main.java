/*
Napisz program, który z podanego ciągu znaków znajdzie same samogłoski.
Na przykład dla napisu “Adam” zwróci tylko “Aa”. Kluczowy algorytm zamknij
w osobnej funkcji/metodzie, która będzie przyjmowała 1 argument wejściowy.
Funkcja ta nie powinna wypisać niczego na ekran.
 */

import java.util.Scanner;

public class Main {
    public static void VowelFinder(String sentence) {
        String[] vowels = {"a", "ą", "e", "ę", "i", "y", "o", "u", "ó"};
        String founded = "";
        for (int i = 0; i < sentence.length(); i++) {
            char eachLetterOfString = sentence.charAt(i);
            boolean found = false;
            for (String vowel : vowels) {
                if (vowel.charAt(0) == eachLetterOfString) {
                    found = true;
                    break;
                }
            }
            if (found) {
                founded += eachLetterOfString;
            }
        }
        // System.out.println(founded);
    }


    public static void main(String[] args) {
        VowelFinder("Dopóty dysk dane nosi, póki nie padnie. Jeden Celeron komputera nie czyni. Nie wywołuj przerwań z BIOS-u");
    }
}
