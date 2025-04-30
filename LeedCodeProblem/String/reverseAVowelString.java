package LeedCodeProblem.String;

public class reverseAVowelString {
    public static void main(String[] args) {
       String str="Icecream";
        System.out.println(findTheRevVowels(str));
    }
    static String findTheRevVowels(String str){
        char[] ch=str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
           if(!findTrueOrFalse(ch[start])){
               start++;
           }
           else if(!findTrueOrFalse(ch[end])){
               end--;
           }else{
               char temp=ch[start];
               ch[start]=ch[end];
               ch[end]=temp;
               start++;
               end--;
           }
        }
        return String.valueOf(ch);
    }
    static boolean findTrueOrFalse(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               return true;
        }
        return  false;

    }

}
