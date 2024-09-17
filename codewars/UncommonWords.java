import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UncommonWords {
    public String[] Solution(String s1, String s2) {
        String[] words = (s1 + " " + s2).split(" ");
        HashMap<String, Integer> cont = new HashMap<>();
        for (String char_ : words){
            cont.put(char_, cont.getOrDefault(char_, 0) + 1);
        }
        List<String> notCommons = new ArrayList<>();

        for (String char_ : cont.keySet()) {
            if (cont.get(char_) == 1) {
                notCommons.add(char_);
            }
        }
        String[] arrayResultados = notCommons.toArray(new String[0]);
        return arrayResultados;
    }

    public static void main(String[] args) {
        UncommonWords example = new UncommonWords();
        System.out.println(example.Solution("this apple is sweet", "thos apple is sour" ));

    }
}