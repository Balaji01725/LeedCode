package LeedCodeProblem.String;

import java.util.HashSet;
import java.util.Set;

public class panagram {
    public static void main(String[] args) {
        String sentence="qwertyuiopasdfghjklzcvbnm";
        System.out.println(findPanagram(sentence));
    }
    static boolean findPanagram(String sentence){
        Set<Character> alphbetSet=new HashSet<>();

                for(int i='a';i<='z';i++){
                    alphbetSet.add((char) i);
                }

                for(int i=0;i<sentence.length();i++){
                    alphbetSet.remove(sentence.charAt(i));

                    if(alphbetSet.isEmpty()){
                        return true;
                    }
                }
                return false;
    }
}
