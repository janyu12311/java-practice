import java.util.ArrayList;
import java.util.Random;

public class Text {
    public static void main(String[] args) {
        ArrayList<Character> listCharacter = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            listCharacter.add((char) ('a' + i));
        }
        for (int i = 0; i < 26; i++) {
            listCharacter.add((char) ('A' + i));
        }
        for (int i = '0'; i <= '9'; i++) {
            listCharacter.add((char) i);
        }
        Random r = new Random();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int tmp = r.nextInt(listCharacter.size());
            result.append(listCharacter.get(tmp));
        }
        System.out.println(result.toString());

    }
}
