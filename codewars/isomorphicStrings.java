package codewars;
import java.util.HashMap;
public class isomorphicStrings{

/**Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself. */
    public boolean Solution(String s, String t){
        if (s.length()==t.length()){
            HashMap<Character, Character> mapST = new HashMap<>();
            HashMap<Character, Character> mapTS = new HashMap<>();

            for (int i=0;i<s.length();i++){
                char charS = s.charAt(i);
                char charT = t.charAt(i);

                //Verificamos el mapeo s->t
                if(mapST.containsKey(charS)){
                    if(mapST.get(charS)!=charT){
                        return false;
                    }
                }else{mapST.put(charS, charT);}


                //verificamos el mapeo t->s
                if (mapTS.containsKey(charT)){
                    if(mapTS.get(charT)!=charS){
                        return false;
                    }
                }else{mapTS.put(charT,charS);}

            } 
        }else{return false;}

        return true;

    }

    public static void main(String[] args) {
        isomorphicStrings example = new isomorphicStrings();
        System.out.println(example.Solution("foo", "bar"));
    }
}