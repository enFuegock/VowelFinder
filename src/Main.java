/*
Napisz program, który z podanego ciągu znaków znajdzie same samogłoski.
Na przykład dla napisu “Adam” zwróci tylko “Aa”. Kluczowy algorytm zamknij
w osobnej funkcji/metodzie, która będzie przyjmowała 1 argument wejściowy.
Funkcja ta nie powinna wypisać niczego na ekran.
 */

public class Main {
    public static void main(String[] args) {
        String[] vowels2 = {"a", "ą", "e", "ę", "i", "y", "o", "u", "ó"};
        String string2 = "Dopóty dysk dane nosi, póki nie padnie. Jeden Celeron komputera nie czyni. Nie wywołuj przerwań z BIOS-u";
        String founded = "";
        for(int i = 0; i < string2.length(); i++) {
            char eachLetterOfString = string2.charAt(i);
            boolean found = false;
            for (String vowel : vowels2) {
                if (vowel.charAt(0) == eachLetterOfString) {
                    found = true;
                    break;
                }
            }
            if (found) {
                founded += eachLetterOfString;
            }
        }
        System.out.println(founded);
        }
    }


