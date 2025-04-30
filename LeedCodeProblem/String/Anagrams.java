package LeedCodeProblem.String;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1="peek";
        String s2="keep";

        if( InAnagram(s1,s2)){
            System.out.println(s1 + "and" + s2 + "are anagrams");
        }
        else{
            System.out.println(s1+"and" +s2+ "not an anagrams");
        }

    }
    static boolean InAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2)){
                return true;
            }

        }
        return false;
    }
}
