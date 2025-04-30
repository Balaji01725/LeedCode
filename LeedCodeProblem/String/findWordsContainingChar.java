package LeedCodeProblem.String;

import java.util.ArrayList;
import java.util.List;
public class findWordsContainingChar {
    public static void main(String[] args) {
        String[] str={"asd","acv","adf"};
        char x='a';
        System.out.println(findChar(str,x));
    }
    static List<Integer> findChar(String[] str,char x){

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            if(str[i].contains(String.valueOf(x))){
                ans.add(i);
            }
        }
        return ans;
    }
}
